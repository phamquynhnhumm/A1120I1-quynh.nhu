package com.example.blogsecurity.service;

import com.example.blogsecurity.model.AppUser;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
     void save(AppUser appUser);
}
