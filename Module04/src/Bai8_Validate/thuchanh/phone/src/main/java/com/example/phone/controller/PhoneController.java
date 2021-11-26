package com.example.phone.controller;

import com.example.phone.model.entity.Phone;
import com.example.phone.model.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping(value = "/phone")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("id").descending();

        model.addAttribute("phones", phoneService.findAll(PageRequest.of(page, 3, sort)));
        return "/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Model model, Phone phone) {
        model.addAttribute("phones", new Phone());
        return "/create";
    }


    @PostMapping(value = "/create")
    private String Create(@Valid @ModelAttribute("phones") Phone phone,BindingResult bindingResult, Model model) {
       new Phone().validate(phone,bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        } else {
            this.phoneService.sava(phone);
            return "redirect:/phone";
        }
    }

}


