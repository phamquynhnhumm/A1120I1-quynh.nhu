package com.example.giohang.model.service;

import com.example.giohang.model.entity.SanPham;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SanphamService {

    List<SanPham> findAll();
    void  save(SanPham sanPham);
    void  remove (SanPham sanPham);
    SanPham finById(Integer id);
}
