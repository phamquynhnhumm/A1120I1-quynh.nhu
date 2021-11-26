package com.example.demsoluotview.controller;


import com.example.demsoluotview.model.entity.Khachhang;
import com.example.demsoluotview.model.entity.MyCounter;
import com.example.demsoluotview.model.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@SessionAttributes("khachhangTalkList")
public class KhachhangController {

    @Autowired
    private KhachhangService khachhangService;

    @ModelAttribute("khachhangTalkList")
    public MyCounter createKhachhangTalkLisy() {
        return new MyCounter();
    }

    @GetMapping(value = "/khachhang")
    private String list(@ModelAttribute(name = "khachhangTalkList") MyCounter khachhangTalkList, @RequestParam(value = "page", defaultValue = "0") int page, Model model) {

        khachhangTalkList.increment();
        model.addAttribute("mgs", "dang list ra");
        model.addAttribute("khachhangs", khachhangService.findAll());
        return "list";
    }

    @GetMapping("/search")
    private String search(@RequestParam(value = "page", defaultValue = "0") int page,
                          @RequestParam(value = "nameSearch", defaultValue = "") String nameSearch, Model model) {
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();
        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("khachhangs", khachhangService.findByNameContaining(nameSearch, PageRequest.of(page, 2, sort)));
        return "/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(@ModelAttribute(name = "khachhangTalkList") List<Khachhang> khachhangTalkList, Khachhang khachhang, Model model) {
        model.addAttribute("khachhangs", new Khachhang());
        return "/create";
    }

    @PostMapping(value = "/create")
    private String Create(Khachhang khachhang, RedirectAttributes redirectAttributes) {

        redirectAttributes.addFlashAttribute("mgs", "đã thêm mới");
        this.khachhangService.save(khachhang);
        return "redirect:/khachhang";
    }

    @GetMapping(value = "/edit")
    private String viewEdit(Khachhang khachhang, Model model, @RequestParam Integer id) {
        model.addAttribute("khachhangs", khachhangService.finById(id));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    private String Edit(Khachhang khachhang) {
        this.khachhangService.save(khachhang);
        return "redirect:/khachhang";
    }

    @GetMapping(value = "/delete")
    private String delete(Khachhang khachhang, @RequestParam Integer id) {
        khachhangService.remove(khachhang);
        return "redirect:/khachhang";
    }

}
