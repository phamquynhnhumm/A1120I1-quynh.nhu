package com.example.ql_hocsinh.model.repository;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import com.example.ql_hocsinh.model.entity.LopHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LophocRepository extends JpaRepository<LopHoc, Integer> {
//    Page<LopHoc> findAllByTenlopAfterContainging(String name, Pageable pageable);

}