package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.hopdong.HopDong;
import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface HopdongService {
    Page<HopDong> findAll(Pageable pageable);
    void  save(HopDong hopDong);
    void remove(String id);
    HopDong finById1(String id);
//    Page<HopDong> findAllByTenNhanVienContaining(String name, Pageable pageable);

}
