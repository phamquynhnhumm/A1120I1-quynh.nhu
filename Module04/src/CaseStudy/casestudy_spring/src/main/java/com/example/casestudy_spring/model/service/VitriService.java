package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.nhanvien.TrinhDo;
import com.example.casestudy_spring.model.entity.nhanvien.ViTri;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VitriService {
    List<ViTri> findAll();

    void  save(ViTri viTri);
    void remove(ViTri viTri);
    ViTri finById1(String name);
}
