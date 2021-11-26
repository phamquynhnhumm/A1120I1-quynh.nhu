package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.hopdong.HopDong;
import com.example.casestudy_spring.model.service.*;
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
public class HopdongController {
    @Autowired
    private HopdongService hopdongService;

    @Autowired
    private HopdongdichvudikemService hopdongdichvudikemService;

    @Autowired
    private DichvudikemService dichvudikemService;

    @Autowired
    private NhanvienService nhanvienService;

    @Autowired
    private KhachhangService khachhangService;
    @Autowired
    private DichvuService dichvuService;

    @GetMapping("/hopdong")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("idHopDong").descending();
        model.addAttribute("hopdongs", hopdongService.findAll(PageRequest.of(page, 5, sort)));
        model.addAttribute("khachhangs", khachhangService.finAll());
        model.addAttribute("nhanviens", nhanvienService.finAll());
        model.addAttribute("dichvus", dichvuService.finAll());
        model.addAttribute("dvdikems", dichvudikemService.findAll());
        return "/hopdong/list";
    }

    @GetMapping("/hopdong/create")
    private String viewCreate(Model model) {
        model.addAttribute("khachhangs", khachhangService.finAll());
        model.addAttribute("nhanviens", nhanvienService.finAll());
        model.addAttribute("dichvus", dichvuService.finAll());
        model.addAttribute("dvdikems", dichvudikemService.findAll());
        model.addAttribute("hopdongdvdikems", hopdongdichvudikemService.findAll());
        model.addAttribute("hopdongs", new HopDong());
        return "/hopdong/create";
    }

    @PostMapping(value = "/hopdong/create")
    private String Create(@Valid @ModelAttribute("hopdongs") HopDong hopDong, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        new HopDong().validate(hopDong, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("khachhangs", khachhangService.finAll());
            model.addAttribute("nhanviens", nhanvienService.finAll());
            model.addAttribute("dichvus", dichvuService.finAll());
            model.addAttribute("dvdikems", dichvudikemService.findAll());
            model.addAttribute("hopdongdvdikems", hopdongdichvudikemService.findAll());
            return "/hopdong/create";
        }
        this.hopdongService.save(hopDong);
        redirectAttributes.addFlashAttribute("mgs", "them moi thanh cong");
        return "redirect:/hopdong";
    }

    @GetMapping(value = "/hopdong/edit")
    private String ViewEdit(@RequestParam("id") String id, Model model) {
        model.addAttribute("hopdongs", hopdongService.finById1(id));
        model.addAttribute("khachhangs", khachhangService.finAll());
        model.addAttribute("nhanviens", nhanvienService.finAll());
        model.addAttribute("dichvus", dichvuService.finAll());
        model.addAttribute("dvdikems", dichvudikemService.findAll());
        model.addAttribute("hopdongdvdikems", hopdongdichvudikemService.findAll());
        return "/hopdong/edit";
    }

    @PostMapping(value = "/hopdong/edit")
    private String Edit(HopDong hopDong, RedirectAttributes redirectAttributes) {
        this.hopdongService.save(hopDong);
        redirectAttributes.addFlashAttribute("mgs", "chỉnh sửa thanh công");
        return "redirect:/hopdong";
    }


    @GetMapping(value = "/hopdong/delete/{idHopDong}")
    public String delete(@PathVariable String idHopDong, RedirectAttributes redirectAttributes) {
        this.hopdongService.remove(idHopDong);
        redirectAttributes.addFlashAttribute("mgs", "Xóa nhân viên thành công");
        return "redirect:/hopdong";
    }


}
