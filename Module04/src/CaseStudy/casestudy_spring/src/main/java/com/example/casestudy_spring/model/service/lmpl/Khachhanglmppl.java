package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.repository.KhachhangREpository;
import com.example.casestudy_spring.model.service.KhachhangService;
import com.example.casestudy_spring.model.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Khachhanglmppl implements KhachhangService {
    @Autowired
    private KhachhangREpository khachhangREpository;

    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachhangREpository.findAll(pageable);
    }

    @Override
    public List<KhachHang> finAll() {
        return khachhangREpository.findAll();
    }

    @Override
    public void save(KhachHang khachHang) {
        khachhangREpository.save(khachHang);
    }

    @Override
    public void remove(String id) {
        khachhangREpository.deleteById(id);
    }

    @Override
    public KhachHang finById1(String id) {
        return khachhangREpository.findById(id).orElse(null);
    }

    @Override
    public Page<KhachHang> findAllByTenNhanVienContaining(String name, Pageable pageable) {
        return khachhangREpository.findAllByTenContaining(name,pageable);
    }
}
