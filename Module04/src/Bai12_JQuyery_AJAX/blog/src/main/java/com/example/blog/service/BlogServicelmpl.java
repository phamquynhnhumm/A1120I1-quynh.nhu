package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServicelmpl  implements  BlogService{

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public void remove(Blog blog) {
        blogRepository.delete(blog);

    }

    @Override
    public Blog update(Integer id, Blog blog) {
        return null;
    }

    @Override
    public Blog finById1(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> findByNameContaining(String name, Pageable pageable) {
        return blogRepository.findAllByNoidungContaining(name, pageable);
    }
}
