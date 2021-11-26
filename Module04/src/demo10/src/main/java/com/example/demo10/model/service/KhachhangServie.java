package com.example.demo10.model.service;

import com.example.demo10.model.entity.Khachhang;
import com.example.demo10.model.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhachhangServie {
    List<Khachhang> finAll();
    void  save(Khachhang khachhang);
    void remove(String id);
    Khachhang finById(String id);
}
