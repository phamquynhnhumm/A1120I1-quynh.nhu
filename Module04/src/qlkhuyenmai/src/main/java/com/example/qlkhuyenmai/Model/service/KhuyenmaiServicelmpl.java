package com.example.qlkhuyenmai.Model.service;

import com.example.qlkhuyenmai.Model.entity.KhuyenMai;
import com.example.qlkhuyenmai.Model.repository.KhuyenmaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenmaiServicelmpl implements KhuyenmaiService {
    @Autowired
    private KhuyenmaiRepository khuyenmaiRepository;

    @Override
    public Page<KhuyenMai> findAll(Pageable pageable) {
        return khuyenmaiRepository.findAll(pageable);
    }

    @Override
    public List<KhuyenMai> finAll() {
        return khuyenmaiRepository.findAll();
    }

    @Override
    public void save(KhuyenMai khuyenMai) {

        this.khuyenmaiRepository.save(khuyenMai);
    }

    @Override
    public void remove(Integer id) {
        this.khuyenmaiRepository.deleteById(id);

    }

    @Override
    public KhuyenMai finById1(Integer id) {
        return khuyenmaiRepository.findById(id).orElse(null);
    }

    @Override
    public Page<KhuyenMai> findName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Page<KhuyenMai> find3truong(String mucgiamia, String tgbatdau, String tgketthuc,Pageable pageable) {
        return khuyenmaiRepository.timkiem3truong(mucgiamia, tgbatdau, tgketthuc, pageable);
    }
}
