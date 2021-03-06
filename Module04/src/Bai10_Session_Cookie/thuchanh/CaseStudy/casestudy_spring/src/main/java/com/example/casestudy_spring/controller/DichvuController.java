package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.dichvu.DichVu;
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
public class DichvuController {

    @Autowired
    private  DichvuService dichvuService;

    @Autowired
    private HouseService houseService;

    @Autowired
    private KieuThueService kieuThueService;

    @Autowired
    private LoaiDVService loaiDVService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private VillaService villaService;


    @GetMapping(value = "/dichvu")
    private String list(@RequestParam(value = "page",defaultValue = "0") int page, Model model)
    {
        Sort sort = Sort.by("idDichVu").and(Sort.by("ten_dichvu")).descending();
        model.addAttribute("dichvus", dichvuService.findAll(PageRequest.of(page, 2, sort)));
//        model.addAttribute("dichvus", dichvuService.findAll());
        return "/dichvu/list";
    }

    @GetMapping(value = "/dichvu/create")
    private String viewCreate(Model model) {
        model.addAttribute("dichvus", new NhanVien());
        model.addAttribute("kieuthues", kieuThueService.findAll());
        model.addAttribute("houses", houseService.findAll());
        model.addAttribute("loaidvs", loaiDVService.findAll());
        model.addAttribute("rooms", roomService.findAll());
        model.addAttribute("villas", villaService.findAll());
        return "/dichvu/create";
    }

    @PostMapping(value = "/dichvu/create")
    private String Create(DichVu dichVu, RedirectAttributes redirectAttributes) {
        this.dichvuService.save(dichVu);
        redirectAttributes.addFlashAttribute("mgs", "Th??m m???i th??nh c??ng");
        return "redirect:/dichvu";
    }


    @GetMapping(value = "/dichvu/edit")
    private String ViewEdit(@RequestParam("id") String id, Model model) {
        model.addAttribute("nhanviens", dichvuService.finById1(id));
        model.addAttribute("kieuthues", kieuThueService.findAll());
        model.addAttribute("houses", houseService.findAll());
        model.addAttribute("loaidvs", loaiDVService.findAll());
        model.addAttribute("rooms", roomService.findAll());
        model.addAttribute("villas", villaService.findAll());
        return "/dichvu/edit";
    }

    @PostMapping(value = "/dichvu/edit")
    private String Edit(DichVu dichVu, RedirectAttributes redirectAttributes) {
        this.dichvuService.save(dichVu);
        redirectAttributes.addFlashAttribute("mgs", "ch???nh s???a Th??nh c??ng");
        return "redirect:/dichvu";
    }


    @GetMapping(value = "/dichvu/delete")
    public String delete(@RequestParam String id, RedirectAttributes redirectAttributes) {
        dichvuService.remove(id);
        redirectAttributes.addFlashAttribute("mgs", "X??a d???ch v??? th??nh c??ng");
        return "redirect:/dichvu";
    }
}
