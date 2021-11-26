package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachhangREpository extends JpaRepository<KhachHang, String> {
    Page<KhachHang> findAllByTenContaining(String name, Pageable pageable);
}
