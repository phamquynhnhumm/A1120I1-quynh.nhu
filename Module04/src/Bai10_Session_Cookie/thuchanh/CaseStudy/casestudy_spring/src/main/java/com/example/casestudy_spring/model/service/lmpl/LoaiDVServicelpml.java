package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.dichvu.LoaiDV;
import com.example.casestudy_spring.model.repository.LoaiDVRepositiry;
import com.example.casestudy_spring.model.service.LoaiDVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiDVServicelpml implements LoaiDVService {
    @Autowired
    private LoaiDVRepositiry loaiDVRepositiry;
    @Override
    public List<LoaiDV> findAll() {
        return loaiDVRepositiry.findAll();
    }

    @Override
    public LoaiDV finById1(String name) {
        return loaiDVRepositiry.findById(name).orElse(null);
    }
}
