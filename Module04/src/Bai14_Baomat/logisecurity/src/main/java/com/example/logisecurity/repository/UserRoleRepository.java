package com.example.logisecurity.repository;

import com.example.logisecurity.model.AppUser;
import com.example.logisecurity.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
