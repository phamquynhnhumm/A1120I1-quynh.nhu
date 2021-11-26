package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.nhanvien.ViTri;
import com.example.casestudy_spring.model.entity.taikhoan.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VitriRepository extends JpaRepository<ViTri, String> {
}
