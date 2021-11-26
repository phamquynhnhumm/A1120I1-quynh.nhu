package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.taikhoan.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaiKhoanRepo extends JpaRepository<TaiKhoan, String> {
    TaiKhoan findByTaiKhoan(String taiKhoan);
    Boolean existsByTaiKhoan(String taiKhoan);
}
