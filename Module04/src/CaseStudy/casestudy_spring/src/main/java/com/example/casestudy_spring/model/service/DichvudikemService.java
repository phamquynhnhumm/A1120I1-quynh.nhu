package com.example.casestudy_spring.model.service;


import com.example.casestudy_spring.model.entity.dichvu.LoaiDV;
import com.example.casestudy_spring.model.entity.hopdong.DichVuDiKem;
import org.springframework.stereotype.Service;

import javax.persistence.SqlResultSetMappings;
import java.util.List;

@Service
public interface DichvudikemService {
    List<DichVuDiKem> findAll();
    DichVuDiKem finById1(String name);
}
