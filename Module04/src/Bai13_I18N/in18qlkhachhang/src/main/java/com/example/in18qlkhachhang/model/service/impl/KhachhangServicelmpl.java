package com.example.in18qlkhachhang.model.service.impl;

import com.example.in18qlkhachhang.model.entity.Khachhang;
import com.example.in18qlkhachhang.model.repository.KhachhangRepository;
import com.example.in18qlkhachhang.model.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhachhangServicelmpl implements KhachhangService {

    @Autowired
    private KhachhangRepository khachhangRepository;

    @Override
    public Page<Khachhang> findAll(Pageable pageable)
    {
        return khachhangRepository.findAll(pageable);
    }

    @Override
    public void save(Khachhang khachhang) {

        khachhangRepository.save(khachhang);
    }

    @Override
    public void remove(Khachhang khachhang) {
        khachhangRepository.delete(khachhang);

    }

    @Override
    public Khachhang update(Integer id, Khachhang khachhang) {
        return null;
    }

    @Override
    public Khachhang finById(Integer id) {
        return khachhangRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Khachhang> findByNameContaining(String name, Pageable pageable) {
        return khachhangRepository.findAllByTenContaining(name,pageable);
    }
}
