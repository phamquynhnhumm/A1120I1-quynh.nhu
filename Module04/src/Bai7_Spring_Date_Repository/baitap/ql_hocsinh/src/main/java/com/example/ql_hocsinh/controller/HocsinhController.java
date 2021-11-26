package com.example.ql_hocsinh.controller;


import com.example.ql_hocsinh.model.entity.Hocsinh;
import com.example.ql_hocsinh.model.service.HocsinhService;
import com.example.ql_hocsinh.model.service.LophocService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.omg.CORBA.CharHolder;
import org.omg.PortableInterceptor.HOLDING;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class HocsinhController {

    @Autowired
    private HocsinhService hocsinhService;

    @Autowired
    private LophocService lophocService;

    @GetMapping("/hocsinh")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model)
    {
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();
        model.addAttribute("hocsinhs",hocsinhService.findAll(PageRequest.of(page,2,sort)));
        return "/lisths";
    }

    @GetMapping("/create")
    private String viewCreate(Hocsinh hocsinh,Model model)
    {
        model.addAttribute("hocsinhs", new Hocsinh());
        model.addAttribute("lops",lophocService.findAll());
        return ("/createhs");
    }

    @PostMapping("/create")
    private String Create(Hocsinh hocsinh, RedirectAttributes redirectAttributes)
    {
//        redirectAttributes.addFlashAttribute("msg","them moi thanh cong");
        this.hocsinhService.save(hocsinh);
        return "redirect:/hocsinh";
    }

    @GetMapping("/edit")
    private  String ViewEdit(@RequestParam Integer id, Model model)
    {
        model.addAttribute("hocsinhs", hocsinhService.findById(id));
        model.addAttribute("lops", lophocService.findAll());
        return "/ediths";
    }

    @PostMapping("/edit")
    private String Edit( Hocsinh hocsinh)
    {
        this.hocsinhService.save(hocsinh);
        return "redirect:/hocsinh";
    }

    @GetMapping("/delete")
    private String delete(@RequestParam Integer id, Hocsinh hocsinh)
    {
        this.hocsinhService.remove(hocsinh);
        return "redirect:/hocsinh";
    }


    @GetMapping("/search")
    private String search(@RequestParam(value = "page", defaultValue = "0") int page,
                          @RequestParam(value = "tensearch", defaultValue = "") String tensearch, Model model)
    {
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();
        model.addAttribute("tensearch", tensearch);
        model.addAttribute("hocsinhs", hocsinhService.findByNameContaining(tensearch,PageRequest.of(page,2,sort)));
        return "/lisths";
    }





}
