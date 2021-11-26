package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.service.KhachhangService;
import com.example.casestudy_spring.model.service.LoaikhachService;
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
public class KhachhangController {
    @Autowired
    private KhachhangService khachhangService;

    @Autowired
    private LoaikhachService loaikhachService;

    @GetMapping("/khachhang")
    private String list(@RequestParam(value = "page",defaultValue = "0") int page, Model model)
    {
        Sort sort = Sort.by("khachHangId").and(Sort.by("ten")).descending();
        model.addAttribute("khachhangs", khachhangService.findAll(PageRequest.of(page,5,sort)));
       model.addAttribute("loaikhachs", loaikhachService.findAll());
        return "/khachhang/list";
    }

    @GetMapping("/khachhang/create")
    private  String viewCreate(Model model){
        model.addAttribute("loaikhachs", loaikhachService.findAll());
        model.addAttribute("khachhangs", new  KhachHang());
        return "/khachhang/create";
    }
    @PostMapping(value = "/khachhang/create")
    private String Create(@Valid @ModelAttribute("khachhangs") KhachHang khachHang, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model)
    {
        new  KhachHang().validate(khachHang, bindingResult);
        if(bindingResult.hasErrors())
        {
            model.addAttribute("loaikhachs", loaikhachService.findAll());
            return "/khachhang/create";
        }
        this.khachhangService.save(khachHang);
        redirectAttributes.addFlashAttribute("mgs","them moi thanh cong");
        return "redirect:/khachhang";
    }


    @GetMapping(value = "/khachhang/edit")
    private String ViewEdit(@RequestParam("id") String id, Model model) {
        model.addAttribute("khachhangs", khachhangService.finById1(id));
        model.addAttribute("loaikhachs", loaikhachService.findAll());
        return "/khachhang/edit";
    }

    @PostMapping(value = "/khachhang/edit")
    private String Edit(KhachHang khachHang, RedirectAttributes redirectAttributes)
    {
        this.khachhangService.save(khachHang);
        redirectAttributes.addFlashAttribute("mgs","chỉnh sửa thanh cong");
        return "redirect:/khachhang";
    }


    @GetMapping(value = "/khachhang/delete/{khachHangId}")
    public String delete(@PathVariable String khachHangId, RedirectAttributes redirectAttributes)
    {
        this.khachhangService.remove(khachHangId);
        redirectAttributes.addFlashAttribute("mgs", "Xóa nhân viên thành công");
        return "redirect:/khachhang";
    }



}
