package com.example.qlkhachhang_theotinh.model.repository;

import com.example.qlkhachhang_theotinh.model.entity.Thanhpho;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThanhphoRepository extends JpaRepository<Thanhpho, Integer> {

    Page<Thanhpho> findAllByTenContaining(String name, Pageable pageable);


}
