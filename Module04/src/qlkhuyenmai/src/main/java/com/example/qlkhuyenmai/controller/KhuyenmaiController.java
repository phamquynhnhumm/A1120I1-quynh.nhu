package com.example.qlkhuyenmai.controller;

import com.example.qlkhuyenmai.Model.entity.KhuyenMai;
import com.example.qlkhuyenmai.Model.service.KhuyenmaiService;
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
public class KhuyenmaiController {

    @Autowired
    public KhuyenmaiService khuyenmaiService;

    @GetMapping(value = "/list")
    public String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("id").and(Sort.by("tieude")).descending();
        model.addAttribute("khuyenmais", this.khuyenmaiService.findAll(PageRequest.of(page, 5, sort)));
        return "/list";
    }

    @GetMapping(value = "/create")
    public String createlist(Model model) {
        model.addAttribute("khuyenmais", new KhuyenMai());
        return "/create";
    }

    @PostMapping(value = "/create")
    public String create(@Valid @ModelAttribute("khuyenmais") KhuyenMai khuyenMai, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        new KhuyenMai().validate(khuyenMai, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        }
        this.khuyenmaiService.save(khuyenMai);
        redirectAttributes.addFlashAttribute("mgs", "thêm mới  khuyến mãi thành công");
        return "redirect:/list";
    }

    @GetMapping(value = "/edit")
    public String editlist(@RequestParam Integer id, Model model) {
        model.addAttribute("khuyenmais", khuyenmaiService.finById1(id));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    public String edit(KhuyenMai khuyenMai, RedirectAttributes redirectAttributes) {
        this.khuyenmaiService.save(khuyenMai);
        System.out.println("  tieeu deef edit" + khuyenMai.getTieude());
        redirectAttributes.addFlashAttribute("mgs", " cập nhật khuyến mãi thành công");
        return "redirect:/list";
    }

    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable Integer id, Model model, RedirectAttributes redirectAttributes) {
        this.khuyenmaiService.remove(id);
        redirectAttributes.addFlashAttribute("mgs", "xóa   khuyến mãi thành công");
        return "redirect:/list";
    }


    @PostMapping(value = "/search")
    public String search(@RequestParam(value = "page", defaultValue = "0") int page,
                         @RequestParam String mucgiamgia,
                         @RequestParam String tgbatdau,
                         @RequestParam String tgketthuc,
                         Model model, RedirectAttributes redirectAttributes) {
        System.out.println("mũ giam gia đang tim là  : " + mucgiamgia);
        Sort sort = Sort.by("id").and(Sort.by("tieude")).descending();
        khuyenmaiService.find3truong(mucgiamgia, tgbatdau, tgketthuc, PageRequest.of(page, 5, sort));
        if (khuyenmaiService.find3truong(mucgiamgia, tgbatdau, tgketthuc, PageRequest.of(page, 5, sort)).equals(null)) {
            redirectAttributes.addFlashAttribute("mgs", "không tìm thấy kết quả thành công");
            return "redirect:/list";
        } else {
        model.addAttribute("mucgiamgia", mucgiamgia);
        model.addAttribute("tgbatdau", tgbatdau);
        model.addAttribute("tgketthuc", tgketthuc);
        model.addAttribute("mgs", "Danh sách tìm thấy ");
        model.addAttribute("khuyenmais", khuyenmaiService.find3truong(mucgiamgia, tgbatdau, tgketthuc, PageRequest.of(page, 5, sort)));
        return "/list";
        }
    }
}
