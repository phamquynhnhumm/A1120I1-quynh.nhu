package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.dichvu.House;
import com.example.casestudy_spring.model.entity.dichvu.Villa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository  extends JpaRepository<House, String> {
}
