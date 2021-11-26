package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.entity.nhanvien.TrinhDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrinhdoService {
    List<TrinhDo> findAll();
    void  save(TrinhDo trinhDo);
    void remove(TrinhDo trinhDo);
    TrinhDo finById1(String name);
}
