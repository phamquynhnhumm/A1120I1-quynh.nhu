package com.example.validate_form.model.service;

import com.example.validate_form.model.entity.User;
import com.example.validate_form.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServicelpml implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {

        this.userRepository.save(user);
    }

    @Override
    public Page<User> findAll(Pageable pageable)
    {

        return userRepository.findAll(pageable);
    }
}
