package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.dichvu.Villa;
import com.example.casestudy_spring.model.entity.taikhoan.VaiTro;
import com.example.casestudy_spring.model.repository.VillaRepository;
import com.example.casestudy_spring.model.repository.VitriRepository;
import com.example.casestudy_spring.model.service.VaitroService;
import com.example.casestudy_spring.model.service.VillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillaServicelpml  implements VillaService {
    @Autowired
    private VillaRepository villaRepository;


    @Override
    public List<Villa> findAll() {
        return villaRepository.findAll();
    }

    @Override
    public Villa finById1(String name) {
        return villaRepository.findById(name).orElse(null);
    }
}
