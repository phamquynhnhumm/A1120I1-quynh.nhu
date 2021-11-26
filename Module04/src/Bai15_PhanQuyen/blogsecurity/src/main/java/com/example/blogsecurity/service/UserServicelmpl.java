package com.example.blogsecurity.service;

import com.example.blogsecurity.model.AppUser;
import com.example.blogsecurity.repository.AppUserRepository;
import com.example.blogsecurity.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements  UserService {
    @Autowired
    private AppUserRepository appUserRepository;
    @Override
    public void save(AppUser appUser) {
        this.appUserRepository.save(appUser);

    }
}
