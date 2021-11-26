package com.example.ql_hocsinh.model.service.impl;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import com.example.ql_hocsinh.model.repository.IHocsinhRepository;
import com.example.ql_hocsinh.model.service.IHocsinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HocSinhService implements IHocsinhService {
    @Autowired
    private IHocsinhRepository hocsinhRepository;

    @Override
    public void sava(Hocsinh hocsinh) {
        this.hocsinhRepository.save(hocsinh);
    }

    @Override
    public List<Hocsinh> finAll() {
        return hocsinhRepository.findAll();
    }

    @Override
    public Hocsinh finById(Integer id) {
        return hocsinhRepository.findById(id).orElse(null);
    }

    @Override
    public Hocsinh update(Integer id, Hocsinh hocsinh) {
        return hocsinhRepository.update(id,hocsinh);
    }

    @Override
    public void remove(Hocsinh hocsinh) {
        this.hocsinhRepository.delete(hocsinh);
    }

    @Override
    public void save(Hocsinh hocsinh) {
        this.hocsinhRepository.save(hocsinh);
    }

//    @Override
//    public Page<Hocsinh> findByNameContaining(String name, Pageable pageable) {
//        return hocsinhRepository.findAllByNameContaining(name, pageable);
//    }

//    @Override
//    public Page<Hocsinh> finByNameContaiing(String ten, Pageable pageable) {
//        return null;
//    }


//    @Override
//    public void removeById(Integer id) {
//        hocsinhRepository.removeById(id);
//    }

}
