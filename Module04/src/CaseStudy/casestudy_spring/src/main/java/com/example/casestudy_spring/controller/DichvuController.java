package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.dichvu.DichVu;
import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.service.DichvuService;
import com.example.casestudy_spring.model.service.KieuThueService;
import com.example.casestudy_spring.model.service.LoaiDVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.rmi.MarshalledObject;

@Controller
public class DichvuController {

    @Autowired
    private DichvuService dichvuService;
    @Autowired
    private KieuThueService kieuThueService;

    @Autowired
    private LoaiDVService loaiDVService;



    @GetMapping(value = "/dichvu")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
      Sort sort = Sort.by("idDichVu").and(Sort.by("tenDichVu")).descending();
    model.addAttribute("dichvus", dichvuService.findAll(PageRequest.of(page, 5, sort)));
//        model.addAttribute("dichvus", dichvuService.findAll());
        return "/dichvu/list";
    }

    @GetMapping(value = "/dichvu/create")
    private String viewCreate(Model model) {
        model.addAttribute("dichvus", new DichVu());
        model.addAttribute("kieuthues", kieuThueService.findAll());
//        model.addAttribute("houses", houseService.findAll());
        model.addAttribute("loaidvs", loaiDVService.findAll());
//        model.addAttribute("rooms", roomService.findAll());
//        model.addAttribute("villas", villaService.findAll());
        return "/dichvu/create";
    }

    @PostMapping(value = "/dichvu/create")
    private String Create(@Valid  @ModelAttribute("dichvus") DichVu dichVu, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasErrors())
        {
            model.addAttribute("kieuthues", kieuThueService.findAll());
//        model.addAttribute("houses", houseService.findAll());
            model.addAttribute("loaidvs", loaiDVService.findAll());
            return "/dichvu/create";
        }

        this.dichvuService.save(dichVu);
        redirectAttributes.addFlashAttribute("mgs", "Thêm mới thành công");
        return "redirect:/dichvu";
    }


    @GetMapping(value = "/dichvu/edit")
    private String ViewEdit(@RequestParam("id") String id, Model model) {
        model.addAttribute("dichvus", dichvuService.finById1(id));
        model.addAttribute("kieuthues", kieuThueService.findAll());
        model.addAttribute("loaidvs", loaiDVService.findAll());
        return "/dichvu/edit";
    }

    @PostMapping(value = "/dichvu/edit")
    private String Edit(DichVu dichVu, RedirectAttributes redirectAttributes) {
        this.dichvuService.save(dichVu);
        redirectAttributes.addFlashAttribute("mgs", "chỉnh sửa Thành công");
        return "redirect:/dichvu";
    }


    @GetMapping(value = "/dichvu/delete/{idDichVu}")
    public String delete(@PathVariable String idDichVu, RedirectAttributes redirectAttributes) {
        dichvuService.remove(idDichVu);
        redirectAttributes.addFlashAttribute("mgs", "Xóa dịch vụ thành công");
        return "redirect:/dichvu";
    }
}
