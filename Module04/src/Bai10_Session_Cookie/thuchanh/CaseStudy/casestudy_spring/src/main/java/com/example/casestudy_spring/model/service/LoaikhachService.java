package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.entity.khachhang.LoaiKhach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoaikhachService {
    List<LoaiKhach> findAll();
    void  save(LoaiKhach loaiKhach);
    void remove(String id);
    LoaiKhach finById1(String id);
//    Page<LoaiKhach> findAllByTenNhanVienContaining(String name, Pageable pageable);

}
