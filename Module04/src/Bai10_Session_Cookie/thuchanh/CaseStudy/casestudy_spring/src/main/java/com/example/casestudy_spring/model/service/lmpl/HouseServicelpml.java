package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.dichvu.House;
import com.example.casestudy_spring.model.repository.HouseRepository;
import com.example.casestudy_spring.model.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServicelpml implements HouseService {
    @Autowired
    private HouseRepository houseRepository;
    @Override
    public List<House> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public House finById1(String name) {
        return houseRepository.findById(name).orElse(null);
    }
}
