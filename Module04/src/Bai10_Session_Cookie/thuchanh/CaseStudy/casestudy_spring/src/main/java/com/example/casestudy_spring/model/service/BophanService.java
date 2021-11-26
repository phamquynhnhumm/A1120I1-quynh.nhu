package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.nhanvien.BoPhan;
import com.example.casestudy_spring.model.entity.nhanvien.TrinhDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BophanService {
    List<BoPhan> findAll();
    void  save(BoPhan boPhan);
    void remove(BoPhan boPhan);
    BoPhan finById1(String name);
}
