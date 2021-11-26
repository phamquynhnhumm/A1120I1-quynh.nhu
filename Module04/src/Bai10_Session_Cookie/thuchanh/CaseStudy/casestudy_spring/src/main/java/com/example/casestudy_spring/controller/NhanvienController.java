package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class NhanvienController {
    @Autowired
    private NhanvienService nhanvienService;

    @Autowired
    private TrinhdoService trinhdoService;

    @Autowired
    private VitriService vitriService;

    @Autowired
    private BophanService bophanService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/nhanvien")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {

        Sort sort = Sort.by("idNhanVien").and(Sort.by("tenNhanVien")).descending();
        model.addAttribute("nhanviens", this.nhanvienService.findAll(PageRequest.of(page, 2, sort)));
        return "/nhanvien/list";
    }

    @GetMapping(value = "/nhanvien/create")
    private String viewCreate(Model model) {
        model.addAttribute("nhanviens", new NhanVien());
        model.addAttribute("trinhdos", trinhdoService.findAll());
        model.addAttribute("vitris", vitriService.findAll());
        model.addAttribute("bophans", bophanService.findAll());
//        model.addAttribute("users", userService.findAll());
        return "/nhanvien/create";
    }

    @PostMapping(value = "/nhanvien/create")
    private String Create(NhanVien nhanVien, RedirectAttributes redirectAttributes)
    {
        this.nhanvienService.save(nhanVien);
        redirectAttributes.addFlashAttribute("mgs","them moi thanh cong");
        return "redirect:/nhanvien";
    }


    @GetMapping(value = "/nhanvien/edit")
    private String ViewEdit(@RequestParam("id") String id, Model model) {
        model.addAttribute("nhanviens", nhanvienService.finById1(id));
        model.addAttribute("trinhdos", trinhdoService.findAll());
        model.addAttribute("vitris", vitriService.findAll());
        model.addAttribute("bophans", bophanService.findAll());
        return "/nhanvien/edit";
    }

    @PostMapping(value = "/nhanvien/edit")
    private String Edit(NhanVien nhanVien, RedirectAttributes redirectAttributes)
    {
        this.nhanvienService.save(nhanVien);
        redirectAttributes.addFlashAttribute("mgs","chỉnh sửa thanh cong");
        return "redirect:/nhanvien";
    }


    @GetMapping(value = "/nhanvien/delete")
    public String delete( @RequestParam String id,RedirectAttributes redirectAttributes)
    {
        nhanvienService.remove(id);
        redirectAttributes.addFlashAttribute("mgs", "Xóa nhân viên thành công");
        return "redirect:/nhanvien";
    }



}
