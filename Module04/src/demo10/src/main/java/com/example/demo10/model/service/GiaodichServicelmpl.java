package com.example.demo10.model.service;

import com.example.demo10.model.entity.GiaoDich;
import com.example.demo10.model.repository.GiaoDichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaodichServicelmpl implements  GiaodichService {
    @Autowired
    private GiaoDichRepository giaoDichRepository;
    @Override
    public List<GiaoDich> finAll() {
        return giaoDichRepository.findAll();
    }

    @Override
    public void save(GiaoDich giaoDich) {

        this.giaoDichRepository.save(giaoDich);
    }

    @Override
    public void remove(String id) {
        this.giaoDichRepository.deleteById(id);

    }

    @Override
    public GiaoDich finById(String id) {
        return giaoDichRepository.findById(id).orElse(null);
    }

    @Override
    public List<GiaoDich> timkiem2truong(String loai, String makhachhang) {
        return giaoDichRepository.timkiem2truong(loai,makhachhang);
    }
}
