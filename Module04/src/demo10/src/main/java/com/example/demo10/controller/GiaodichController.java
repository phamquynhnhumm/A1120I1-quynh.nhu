package com.example.demo10.controller;

import com.example.demo10.model.entity.GiaoDich;
import com.example.demo10.model.entity.SanPham;
import com.example.demo10.model.service.GiaodichService;
import com.example.demo10.model.service.KhachhangServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class GiaodichController {

    @Autowired
    public GiaodichService giaodichService;

    @Autowired
    public KhachhangServie khachhangServie;

    @GetMapping(value = "/giaodich")
    private String list( Model model) {
        model.addAttribute("khachhangs", khachhangServie.finAll());
        model.addAttribute("giaodichs", giaodichService.finAll());
        model.addAttribute("khachhangList", khachhangServie.finAll());
        return "/list";
    }


    @GetMapping(value = "/create")
    public String createlist(Model model) {
        model.addAttribute("giaodichs", new GiaoDich());
        model.addAttribute("khachhangs", khachhangServie.finAll());
        return "/create";
    }

    @PostMapping(value = "/create")
    public String create( @Valid @ModelAttribute("giaodichs") GiaoDich giaoDich,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        new GiaoDich().validate(giaoDich, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("khachhangs", khachhangServie.finAll());
            return "/create";
        }
        this.giaodichService.save(giaoDich);
        redirectAttributes.addFlashAttribute("mgs", "thêm mới giao dich  thành công");
        return "redirect:/giaodich";
    }

    @GetMapping(value = "/edit")
    public String editlist(@RequestParam String id, Model model) {
        model.addAttribute("giaodichs", giaodichService.finById(id));
        model.addAttribute("khachhangs", khachhangServie.finAll());
        return "/edit";
    }

    @PostMapping(value = "/edit")
    public String edit(GiaoDich giaoDich, RedirectAttributes redirectAttributes) {
        this.giaodichService.save(giaoDich);
        return "redirect:/giaodich";
    }

    @GetMapping(value = "/delete/{maGiaDich}")
    public String delete(@PathVariable String maGiaDich, Model model, RedirectAttributes redirectAttributes) {
        this.giaodichService.remove(maGiaDich);
        redirectAttributes.addFlashAttribute("mgs", "xóa  thành công");
        return "redirect:/giaodich";
    }

    @GetMapping("/search")
    public String searchCustomer(@RequestParam String loaidichvu,
                                 @RequestParam  String idkhachhang, Model model){

        model.addAttribute("loaidichvu",loaidichvu);
        model.addAttribute("idkhachhang", idkhachhang);
        model.addAttribute("khachhangList", khachhangServie.finAll());

        System.out.println("sao lo laays ddc dichj vuj nhir" + loaidichvu);
        System.out.println("sao lo laays ddc dichj vuj nhir" + idkhachhang);
        model.addAttribute("giaodichs", giaodichService.timkiem2truong(loaidichvu, idkhachhang));
        return "/list";
    }

}
