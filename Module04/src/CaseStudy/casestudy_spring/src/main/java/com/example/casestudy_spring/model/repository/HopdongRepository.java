package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.hopdong.HopDong;
import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HopdongRepository extends JpaRepository<HopDong, String> {
}