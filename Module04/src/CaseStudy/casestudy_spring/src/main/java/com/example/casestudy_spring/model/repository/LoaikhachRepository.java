package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.khachhang.LoaiKhach;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoaikhachRepository extends JpaRepository<LoaiKhach, String> {
//    Page<NhanVien> findAllByTenNhanVienContaining(String name, Pageable pageable);
}

