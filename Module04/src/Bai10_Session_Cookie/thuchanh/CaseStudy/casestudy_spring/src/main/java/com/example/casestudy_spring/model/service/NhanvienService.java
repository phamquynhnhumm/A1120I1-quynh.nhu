package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NhanvienService {
    Page<NhanVien> findAll(Pageable pageable);
    void  save(NhanVien nhanvien);
    void remove(String id);
    NhanVien finById1(String id);
    Page<NhanVien> findAllByTenNhanVienContaining(String name, Pageable pageable);

}
