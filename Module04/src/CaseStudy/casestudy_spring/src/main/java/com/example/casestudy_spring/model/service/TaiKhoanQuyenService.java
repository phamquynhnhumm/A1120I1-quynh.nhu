package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.taikhoan.Quyen;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaiKhoanQuyenService {
    List<Quyen> finAllQuyen(String taikhoan);

}
