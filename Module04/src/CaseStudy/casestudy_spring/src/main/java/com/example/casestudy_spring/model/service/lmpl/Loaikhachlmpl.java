package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.khachhang.LoaiKhach;
import com.example.casestudy_spring.model.repository.LoaikhachRepository;
import com.example.casestudy_spring.model.service.LoaikhachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Loaikhachlmpl implements LoaikhachService {
    @Autowired
    private LoaikhachRepository loaikhachRepository;

    @Override
    public List<LoaiKhach> findAll() {

        return loaikhachRepository.findAll();
    }

    @Override
    public void save(LoaiKhach loaiKhach) {
        loaikhachRepository.save(loaiKhach);
    }

    @Override
    public void remove(String id) {
        loaikhachRepository.deleteById(id);
    }

    @Override
    public LoaiKhach finById1(String id) {
        return loaikhachRepository.findById(id).orElse(null);
    }
}
