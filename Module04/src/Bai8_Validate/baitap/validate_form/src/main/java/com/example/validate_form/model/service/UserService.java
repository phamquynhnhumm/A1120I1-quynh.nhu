package com.example.validate_form.model.service;

import com.example.validate_form.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    void save(User user);
    Page<User> findAll(Pageable pageable);
}
