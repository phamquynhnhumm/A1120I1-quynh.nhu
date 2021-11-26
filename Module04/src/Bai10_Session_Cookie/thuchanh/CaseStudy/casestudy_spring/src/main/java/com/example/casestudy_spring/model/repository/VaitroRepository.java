package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.taikhoan.VaiTro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaitroRepository extends JpaRepository<VaiTro, String> {
//    Page<VaiTro> findAllByTenContaining(String name, Pageable pageable);


}