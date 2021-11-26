package com.example.blogsecurity.repository;

import com.example.blogsecurity.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository  extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);
}
