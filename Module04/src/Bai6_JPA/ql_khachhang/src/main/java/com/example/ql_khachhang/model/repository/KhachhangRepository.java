package com.example.ql_khachhang.model.repository;

import com.example.ql_khachhang.model.entity.Khachhang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KhachhangRepository extends JpaRepository<Khachhang, Integer> {

    Page<Khachhang> findAllByTenContaining(String name, Pageable pageable);


}
