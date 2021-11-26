package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.dichvu.DichVu;
import com.example.casestudy_spring.model.entity.hopdong.DichVuDiKem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DichvudikemRepository extends JpaRepository<DichVuDiKem, String> {
    Page<DichVu> findAllByTenDVDiKemContaining (String name, Pageable pageable);
}

