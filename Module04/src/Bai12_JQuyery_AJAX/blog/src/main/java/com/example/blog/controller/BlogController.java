package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @Autowired
    private BlogServicelmpl blogServicelmpl;

    @GetMapping("/blog")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("id").descending();

        model.addAttribute("blogs", blogServicelmpl.findAll(PageRequest.of(page, 2, sort)));
        return "list";
    }
    @GetMapping("/search")
    private String search(@RequestParam(value = "page",defaultValue = "0") int page,
                          @RequestParam(value = "nameSearch",defaultValue = "") String nameSearch,Model model){
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();
        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("blogs", blogServicelmpl.findByNameContaining(nameSearch, PageRequest.of(page, 2, sort)));
          return "/list";
    }
    @GetMapping(value = "/create")
    private String viewCreate(Blog blog, Model model) {
        model.addAttribute("blogs", new Blog());
        return "/create";
    }

    @PostMapping(value = "/create/{noidungs}")
    private String Create(@PathVariable("noidungs") String noidungs, Blog blog, Model model) {
        blog.setNoidung(noidungs);
        this.blogServicelmpl.save(blog);
        return "redirect:/blog";
    }

    @GetMapping(value = "/edit")
    private String viewEdit(Blog blog, Model model, @RequestParam Integer id) {
        model.addAttribute("blogs", blogServicelmpl.finById1(id));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    private String Edit(Blog blog) {
        this.blogServicelmpl.save(blog);
        return "redirect:/blog";
    }

    @GetMapping(value = "/delete")
    private String delete(Blog blog, @RequestParam Integer id) {
        blogServicelmpl.remove(blog);
        return "redirect:/blog";
    }
}
