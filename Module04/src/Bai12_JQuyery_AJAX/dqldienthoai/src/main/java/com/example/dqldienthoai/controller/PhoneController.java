package com.example.dqldienthoai.controller;

import com.example.dqldienthoai.model.entity.Phone;
import com.example.dqldienthoai.model.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


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


    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<Phone> allPhones(@RequestParam(value = "page", defaultValue = "0") int page) {
        Sort sort = Sort.by("id").descending();
        return phoneService.findAll(PageRequest.of(page, 3, sort));

    }

    @PostMapping(value = "/create/{numbes}")
    private String Create(@PathVariable("numbes") String numbes, @ModelAttribute("phones") Phone phone, BindingResult bindingResult, Model model) {
            phone.setNumber(numbes);
            this.phoneService.sava(phone);
            return "redirect:/phone";
    }
}


