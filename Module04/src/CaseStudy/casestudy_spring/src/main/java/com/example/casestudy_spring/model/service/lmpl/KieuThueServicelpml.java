package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.dichvu.KieuThue;
import com.example.casestudy_spring.model.repository.KhieuthueRepository;
import com.example.casestudy_spring.model.service.KieuThueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KieuThueServicelpml implements KieuThueService {

    @Autowired
    private KhieuthueRepository khieuthueRepository;

    @Override
    public List<KieuThue> findAll() {
        return khieuthueRepository.findAll();
    }

    @Override
    public KieuThue finById1(String name) {
        return khieuthueRepository.findById(name).orElse(null);
    }
}
