package com.example.ql_hocsinh.model.service.impl;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import com.example.ql_hocsinh.model.entity.Lop;
import com.example.ql_hocsinh.model.repository.ILopRepository;
import com.example.ql_hocsinh.model.service.ILopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopHocService  implements ILopService {
    @Autowired
    private ILopRepository lopRepository;

    @Override
    public List<Lop> findAll() {
        return lopRepository.findAll();
    }

//    @Override
//    public Hocsinh update(Integer id, Hocsinh hocsinh) {
//        return null;
//    }
}
