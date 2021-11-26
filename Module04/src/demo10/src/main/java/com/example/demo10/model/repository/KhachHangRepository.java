package com.example.demo10.model.repository;

import com.example.demo10.model.entity.Khachhang;
import com.example.demo10.model.entity.Loai;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRepository extends JpaRepository<Khachhang, String> {
}
