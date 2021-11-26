package com.example.blogsecurity.repository;


import com.example.blogsecurity.model.AppUser;
import com.example.blogsecurity.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);

}
