package com.example.demo10.model.service;

import com.example.demo10.model.entity.GiaoDich;
import com.example.demo10.model.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GiaodichService {
    List<GiaoDich> finAll();
    void  save(GiaoDich giaoDich);
    void remove(String id);
    GiaoDich finById(String id);
    List<GiaoDich> timkiem2truong(String loai, String makhachhang);
}
