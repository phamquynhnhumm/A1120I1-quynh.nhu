package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.dichvu.Villa;
import com.example.casestudy_spring.model.entity.nhanvien.TrinhDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VillaService {
    List<Villa> findAll();
    Villa finById1(String name);
}
