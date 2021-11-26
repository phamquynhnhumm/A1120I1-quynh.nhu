package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.dichvu.KieuThue;
import com.example.casestudy_spring.model.entity.hopdong.HopDongDichVuDiKem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HopdongdichvudikemService {
    List<HopDongDichVuDiKem> findAll();
    HopDongDichVuDiKem finById1(String name);
}
