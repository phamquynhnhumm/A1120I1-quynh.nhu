package com.example.blogsecurity.service;


import com.example.blogsecurity.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    void remove(Blog blog);
    Blog  update(Integer id, Blog blog);
    Blog finById1(Integer id);
    Page<Blog> findByNameContaining(String name,Pageable pageable);
}
