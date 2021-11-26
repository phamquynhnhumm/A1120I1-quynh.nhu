package com.example.logisecurity.repository;

import com.example.logisecurity.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository  extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);
}
