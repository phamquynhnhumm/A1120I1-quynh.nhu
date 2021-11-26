package com.example.demo10.model.service;

import com.example.demo10.model.entity.Khachhang;
import com.example.demo10.model.entity.SanPham;
import com.example.demo10.model.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachhangServicelmpl  implements  KhachhangServie{
    @Autowired
    public KhachHangRepository khachHangRepository;
    @Override
    public List<Khachhang> finAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void save(Khachhang khachhang) {
this.khachHangRepository.save(khachhang);
    }

    @Override
    public void remove(String id) {
        this.khachHangRepository.deleteById(id);

    }

    @Override
    public Khachhang finById(String id) {
        return khachHangRepository.findById(id).orElse(null);
    }
}
