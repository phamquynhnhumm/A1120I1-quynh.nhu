package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface KhachhangService {
    Page<KhachHang> findAll(Pageable pageable);
    void  save(KhachHang khachHang);
    void remove(String id);
    KhachHang finById1(String id);
    Page<KhachHang> findAllByTenNhanVienContaining(String name, Pageable pageable);

}