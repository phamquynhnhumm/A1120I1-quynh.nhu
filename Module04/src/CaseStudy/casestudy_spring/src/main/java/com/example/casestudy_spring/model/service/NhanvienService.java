package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface NhanvienService {
    Page<NhanVien> findAll(Pageable pageable);

    List<NhanVien> finAll();

    void save(NhanVien nhanvien);

    void remove(String id);

    NhanVien finById1(String id);

    //    Page<NhanVien> findAllByTenNhanVienContaining(String name, Pageable pageable);
    Page<NhanVien> timkiemtheo3truong(String name, String sdt, String idbophan, Pageable pageable);

//    Page<NhanVien> timkiemtheo2truong(Pageable pageable, String name);

}
