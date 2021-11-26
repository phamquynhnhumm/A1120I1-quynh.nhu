package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.dichvu.DichVu;
import com.example.casestudy_spring.model.repository.DichvuRepository;
import com.example.casestudy_spring.model.service.DichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichVuServicelmpl implements DichvuService {

    @Autowired
    private DichvuRepository dichvuRepository;

    @Override
    public Page<DichVu> findAll(Pageable pageable) {
        return dichvuRepository.findAll(pageable);
    }

    @Override
    public List<DichVu> finAll() {
        return dichvuRepository.findAll();
    }

    @Override
    public void save(DichVu dichVu) {
        this.dichvuRepository.save(dichVu);
    }

    @Override
    public void remove(String id) {
        dichvuRepository.deleteById(id);
    }

    @Override
    public DichVu finById1(String id) {
        return dichvuRepository.findById(id).orElse(null);
    }

    @Override
    public Page<DichVu> finbyname(String name, Pageable pageable) {
        return dichvuRepository.findByTenDichVuContaining(name, pageable);
    }
}
