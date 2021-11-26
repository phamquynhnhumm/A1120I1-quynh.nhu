package com.example.demsoluotview.model.service;

import com.example.demsoluotview.model.entity.Khachhang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhachhangService {
    List<Khachhang> findAll();
    void save(Khachhang khachhang);
    void remove(Khachhang khachhang);
    Khachhang update(Integer id, Khachhang khachhang);
    Khachhang finById(Integer id);
    Page<Khachhang> findByNameContaining(String name,Pageable pageable);
}
