package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.nhanvien.ViTri;
import com.example.casestudy_spring.model.repository.VitriRepository;
import com.example.casestudy_spring.model.service.VitriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitriServicelmpl  implements VitriService {
    @Autowired
    private VitriRepository vitriRepository;

    @Override
    public List<ViTri> findAll() {
        return vitriRepository.findAll();
    }

    @Override
    public void save(ViTri viTri) {
        this.vitriRepository.save(viTri);
    }

    @Override
    public void remove(ViTri viTri) {
        this.vitriRepository.delete(viTri);
    }

    @Override
    public ViTri finById1(String name) {
        return vitriRepository.findById(name).orElse(null);
    }
}
