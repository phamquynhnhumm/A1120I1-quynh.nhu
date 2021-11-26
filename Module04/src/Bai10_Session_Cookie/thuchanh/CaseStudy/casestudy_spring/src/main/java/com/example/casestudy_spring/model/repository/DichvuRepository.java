package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.dichvu.DichVu;
import com.example.casestudy_spring.model.entity.dichvu.Villa;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DichvuRepository  extends JpaRepository<DichVu, String> {
    Page<DichVu> findByTenDichVuContaining(String name, Pageable pageable);
}
