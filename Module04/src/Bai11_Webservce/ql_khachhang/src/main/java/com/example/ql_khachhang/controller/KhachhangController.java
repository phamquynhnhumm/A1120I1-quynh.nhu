package com.example.ql_khachhang.controller;


import com.example.ql_khachhang.model.entity.Khachhang;
import com.example.ql_khachhang.model.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KhachhangController {

    @Autowired
    private KhachhangService khachhangService;

    @GetMapping(value = "/khachhang")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
//        Sort sort = Sort.by("name").and(Sort.by("id")).descending(); ten chứ không phải name
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();

        model.addAttribute("khachhangs", khachhangService.findAll(PageRequest.of(page, 2, sort)));
        return "list";
    }

    //    @GetMapping("/khachhang")
//    public ModelAndView listCustomers(Pageable pageable){
//        Page<Khachhang> khachhangs = khachhangService.findAll(pageable);
//        ModelAndView modelAndView = new ModelAndView("/list");
//        modelAndView.addObject("Khachhangs", khachhangs);
//        return modelAndView;
//    }
    @GetMapping("/search")
    private String search(@RequestParam(value = "page",defaultValue = "0") int page,
                          @RequestParam(value = "nameSearch",defaultValue = "") String nameSearch,Model model){
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();
        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("khachhangs", khachhangService.findByNameContaining(nameSearch, PageRequest.of(page, 2, sort)));
        // search chung trang với list thì khi gửi giá trị lên trang HTML thì nhớ trùm tên với cái trên /khachhang của em nhé oke an
        // nhuwng em ko hieu cho ni   PageRequest.of(page, 2, sort) ddeer lam chi as ah
        // page là để biết số trang hiện tại, 2: số line muốn hiển thị, sor là sort :))

        //        model.addAttribute("khachhangs", khachhangService.findByNameContaining(nameSearch, PageRequest.ofSize(1)));
        return "/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Khachhang khachhang, Model model) {
        model.addAttribute("khachhangs", new Khachhang());
        return "/create";
    }

    @PostMapping(value = "/create")
    private String Create(Khachhang khachhang, Model model) {
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
