package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.entity.taikhoan.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhanvienRepository extends JpaRepository<NhanVien, String> {
    Page<NhanVien> findAllByTenNhanVienContaining(String name, Pageable pageable);
}
