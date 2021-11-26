package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.taikhoan.TaiKhoan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaiKhoanService {
    TaiKhoan find(String taiKhoan);
    void save(TaiKhoan taiKhoan);
    void delete(TaiKhoan taiKhoan);
    TaiKhoan findById(String taikhoan);
    List<TaiKhoan> findAll();
}
