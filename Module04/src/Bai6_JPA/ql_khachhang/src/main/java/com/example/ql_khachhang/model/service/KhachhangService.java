package com.example.ql_khachhang.model.service;

import com.example.ql_khachhang.model.entity.Khachhang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhachhangService {
    Page<Khachhang> findAll(Pageable pageable);
    void save(Khachhang khachhang);
    void remove(Khachhang khachhang);
    Khachhang update(Integer id, Khachhang khachhang);
    Khachhang finById(Integer id);
    Page<Khachhang> findByNameContaining(String name,Pageable pageable);
}
