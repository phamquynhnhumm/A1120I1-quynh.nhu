package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import com.example.blog.service.BlogServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogRest {

    @Autowired
    private BlogServicelmpl blogRepository;

    @GetMapping(value = "/blogrest")
    private ResponseEntity<Page<Blog>> List(@RequestParam(value = "page", defaultValue = "0") int page, Model model)
    {
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();
        Page<Blog> blogs = blogRepository.findAll(PageRequest.of(page, 2, sort));
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @PostMapping("/createrest")
    private ResponseEntity<Void> createRest(@RequestBody Blog blog) {
        this.blogRepository.save(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/editrest", method = RequestMethod.PUT)
    private ResponseEntity<?> edit(@PathVariable("id") int id, @RequestBody  Blog blog) {
        Blog blogedit = this.blogRepository.finById1(id);
        if (blogedit == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogedit = blog;
        this.blogRepository.save(blogedit);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
