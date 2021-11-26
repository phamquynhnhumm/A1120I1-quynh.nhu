package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.nhanvien.TrinhDo;
import com.example.casestudy_spring.model.entity.taikhoan.User;
import com.example.casestudy_spring.model.entity.taikhoan.VaiTro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VaitroService {

    List<VaiTro> findAll();

    void save(VaiTro vaiTro);

    void remove(VaiTro vaiTro);


    VaiTro findById(String vaitro_id);

//    Page<VaiTro> findByNameContaining(String vaitro_id, Pageable pageable);
}
