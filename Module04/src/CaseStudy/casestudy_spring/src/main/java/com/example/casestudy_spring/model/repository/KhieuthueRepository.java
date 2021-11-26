package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.dichvu.KieuThue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhieuthueRepository  extends JpaRepository<KieuThue, String> {
}
