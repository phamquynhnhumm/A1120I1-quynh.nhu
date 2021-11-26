package com.example.ql_hocsinh.model.service;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IHocsinhService {
    void sava(Hocsinh hocsinh);
    List<Hocsinh> finAll();
    Hocsinh finById(Integer id);
    Hocsinh update(Integer id, Hocsinh hocsinh);
    void  remove(Hocsinh hocsinh);
    void save(Hocsinh hocsinh);

//    Page<Hocsinh> findByNameContaining(String name, Pageable pageable);


}
