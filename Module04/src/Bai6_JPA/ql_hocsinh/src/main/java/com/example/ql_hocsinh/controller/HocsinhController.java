package com.example.ql_hocsinh.controller;


import com.example.ql_hocsinh.model.entity.Hocsinh;
import com.example.ql_hocsinh.model.service.IHocsinhService;
import com.example.ql_hocsinh.model.service.ILopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
public class HocsinhController {

    @Autowired
    private IHocsinhService hocsinhService;

    @Autowired
    private ILopService lopService;

    // tạo 1 mảng lưu value giới tính
    private String[] arrGender = new String[]{"Nữ", "Nam", "BueDue"};

    @GetMapping(value = "/hienthi")
    public ModelAndView ListHocsinh() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Hocsinh> hocsinhs = hocsinhService.finAll();
        modelAndView.addObject("hocsinhs", hocsinhs);
//        modelAndView.addObject("lophoc", lopService.findAll());
        return modelAndView;
    }

    @GetMapping(value = ("/create"))
    public String viewCreateHocSinh(Model model) {
        model.addAttribute("listGender", arrGender);
        model.addAttribute("hocsinhs", new Hocsinh());
        model.addAttribute("lops", lopService.findAll());
        return "create_hs";
    }

    @PostMapping(value = "/create")
    public String createHocsinh(Hocsinh hocsinh,RedirectAttributes redirectAttributes) {
        this.hocsinhService.sava(hocsinh);
     redirectAttributes.addFlashAttribute("mgs","them moi thanh cong");
        return "redirect:/hienthi";
    }

    @GetMapping (value = "edit")
    public String viewEdit (Hocsinh hocsinh, @RequestParam Integer idhocsinh, Model model)
    {
        model.addAttribute("lops",lopService.findAll());
        model.addAttribute("hocsinhs", hocsinhService.finById(idhocsinh));
        return "edit";
    }

    @PostMapping(value = "edit")
    public String edit(Hocsinh hocsinh, @RequestParam Integer id, Model model)
    {
        this.hocsinhService.sava(hocsinh);
        return "redirect:/hienthi";
    }

    @GetMapping(value = "delete")
    public String delete(Hocsinh hocsinh, @RequestParam Integer id, Model model)
    {
        hocsinhService.remove(hocsinh);
        return "redirect:/hienthi";
    }



}
