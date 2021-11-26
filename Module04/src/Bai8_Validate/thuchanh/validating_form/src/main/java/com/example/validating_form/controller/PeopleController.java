package com.example.validating_form.controller;

import com.example.validating_form.model.entity.People;
import com.example.validating_form.model.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping( value = "/people")
    private String list (@RequestParam(value = "page", defaultValue = "0") int page, Model model)
    {
        Sort sort = Sort.by("name").and(Sort.by("id")).descending();

        model.addAttribute("peoples", peopleService.findAll(PageRequest.of(page, 2, sort)));
        return "/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Model model) {
        model.addAttribute("peoples", new People());
        return "/create";
    }

    @PostMapping(value = "/create")
    private String Create(@Valid @ModelAttribute("peoples") People people, BindingResult bindingResult,Model model) {
//      nếu bắt đc lỗi trả về create
        if(bindingResult.hasFieldErrors())
        {

            return "/create";
        }
        else {
            this.peopleService.save(people);
            return "redirect:/people";
        }
    }

}
