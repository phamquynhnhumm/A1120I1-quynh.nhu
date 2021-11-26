package com.example.validate_form.controller;


import com.example.validate_form.model.entity.User;
import com.example.validate_form.model.service.UserService;
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
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("id").descending();

        model.addAttribute("users", userService.findAll(PageRequest.of(page, 3, sort)));
        return "/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Model model, User user) {
        model.addAttribute("users", new User());
        return "/create";
    }

    @PostMapping(value = "/create")
    private String Create(@Valid @ModelAttribute("users") User user, BindingResult bindingResult, Model model) {
        new User().validate(user,bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        } else {
            this.userService.save(user);
            return "redirect:/user";
        }
    }

}
