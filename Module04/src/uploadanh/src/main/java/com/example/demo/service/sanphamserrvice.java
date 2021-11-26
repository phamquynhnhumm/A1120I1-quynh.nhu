package com.example.demo.service;

import com.example.demo.repo.sanphamRepo;
import com.example.demo.sanpham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sanphamserrvice implements sanphamservice {
    @Autowired
    private sanphamRepo sanphamRepo;

    @Override
    public List<sanpham> finAll() {
        return sanphamRepo.findAll();
    }


    @Override
    public void save(sanpham sanpham) {
        sanphamRepo.save(sanpham);
    }

    @Override
    public void remove(String id) {

    }
}
