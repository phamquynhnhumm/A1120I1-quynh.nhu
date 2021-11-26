package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.dichvu.House;
import com.example.casestudy_spring.model.entity.dichvu.Villa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HouseService {
    List<House> findAll();
    House finById1(String name);
}
