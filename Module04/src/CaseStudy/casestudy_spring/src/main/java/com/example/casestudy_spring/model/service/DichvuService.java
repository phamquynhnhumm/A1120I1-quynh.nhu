package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.dichvu.DichVu;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DichvuService {
    Page<DichVu> findAll(Pageable pageable);
    List<DichVu> finAll();
    void  save(DichVu dichVu);
    void remove(String id);
    DichVu finById1(String id);
    Page<DichVu> finbyname(String name, Pageable pageable);
}
