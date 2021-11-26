package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.dichvu.KieuThue;
import com.example.casestudy_spring.model.entity.dichvu.LoaiDV;
import com.example.casestudy_spring.model.entity.dichvu.Villa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhieuthueRepository  extends JpaRepository<KieuThue, String> {
}
