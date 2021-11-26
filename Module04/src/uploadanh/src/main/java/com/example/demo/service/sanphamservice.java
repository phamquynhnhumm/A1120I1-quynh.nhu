package com.example.demo.service;

import com.example.demo.sanpham;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface sanphamservice {
    List<sanpham> finAll();

    void save(sanpham sanpham);

    void remove(String id);


}
