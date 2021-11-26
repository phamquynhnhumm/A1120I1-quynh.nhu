package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.nhanvien.BoPhan;
import com.example.casestudy_spring.model.entity.taikhoan.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BophanRepository extends JpaRepository<BoPhan, String> {
}
