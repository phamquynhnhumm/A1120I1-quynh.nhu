package com.example.qlkhuyenmai.Model.service;

import com.example.qlkhuyenmai.Model.entity.KhuyenMai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhuyenmaiService {
    Page<KhuyenMai> findAll(Pageable pageable);
    List<KhuyenMai> finAll();
    void  save(KhuyenMai khuyenMai);
    void remove(Integer id);
    KhuyenMai finById1(Integer id);
    Page<KhuyenMai> findName(String name, Pageable pageable);
    Page<KhuyenMai> find3truong(String mucgiamia, String tgbatdau, String tgketthuc,Pageable pageable);

}
