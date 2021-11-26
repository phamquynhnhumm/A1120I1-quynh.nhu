package com.example.ql_hocsinh.model.service;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface HocsinhService {
    Page<Hocsinh> findAll(Pageable pageable);
    void  save(Hocsinh hocsinh);
    void  remove(Hocsinh hocsinh);
    Hocsinh update(Integer id, Hocsinh hocsinh);
    Hocsinh findById( Integer id);
    Page<Hocsinh> findByNameContaining(String ten, Pageable pageable);
}

