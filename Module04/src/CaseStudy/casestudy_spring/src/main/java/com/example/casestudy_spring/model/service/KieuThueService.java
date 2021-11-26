package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.dichvu.KieuThue;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KieuThueService {

    List<KieuThue> findAll();
    KieuThue finById1(String name);
}
