package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByNoidungContaining(String noidung, Pageable pageable);
}
