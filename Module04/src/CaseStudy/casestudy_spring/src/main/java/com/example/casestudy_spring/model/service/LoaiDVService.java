package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.dichvu.LoaiDV;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoaiDVService {
    List<LoaiDV> findAll();
    LoaiDV finById1(String name);
}
