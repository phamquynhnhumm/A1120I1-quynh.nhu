package com.example.ql_hocsinh.model.repository;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HocsinhRepository extends JpaRepository<Hocsinh, Integer> {
    Page<Hocsinh> findAllByTenContaining(String name, Pageable pageable);

}
