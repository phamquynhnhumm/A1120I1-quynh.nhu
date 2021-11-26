package com.example.giohang.controller;

import com.example.giohang.model.entity.SanPham;
import com.example.giohang.model.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("muahangTalk")
public class SanphamController {
    @Autowired
    private SanphamService sanphamService;

    @ModelAttribute("muahangTalk")
    public List<SanPham> muahangTalm() {
        return new ArrayList<>();
    }

    @GetMapping(value = "/")
    private String viewlist(Model model) {
        model.addAttribute("sanphams", sanphamService.findAll());
        return "/list";

    }

    @GetMapping(value = "/view")
    private String chitieit(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("sanphams", sanphamService.finById(id));
        return "/view";
    }

    @GetMapping(value = "/giohang")
    private String giohang(@RequestParam("id") Integer id, @ModelAttribute(name = "muahangTalk") List<SanPham> muahangTalk, Model model) {
        SanPham sanPham = sanphamService.finById(id);
        muahangTalk.add(sanPham);
        model.addAttribute("muahangTalk", muahangTalk);
        model.addAttribute("mgs", "thêm giỏ hàng thành công");
        return "/giohang";
    }

    @GetMapping(value = "/delete")
    private String delete(@RequestParam("id") Integer id, @ModelAttribute(name = "muahangTalk") List<SanPham> muahangTalk, RedirectAttributes redirectAttributes) {
        for (int i = 0; i < muahangTalk.size(); i++) {
            if (muahangTalk.get(i).getIdSanpham() == id) {
                muahangTalk.remove(i);
            }
        }
        return "redirect:/viewgiohang";
    }

    @GetMapping(value = "/viewgiohang")
    private String viewgh(@ModelAttribute(name = "muahangTalk") List<SanPham> muahangTalk, RedirectAttributes redirectAttributes, Model model) {
        model.addAttribute("muahangTalk", muahangTalk);
        return "/giohang";
    }

}
