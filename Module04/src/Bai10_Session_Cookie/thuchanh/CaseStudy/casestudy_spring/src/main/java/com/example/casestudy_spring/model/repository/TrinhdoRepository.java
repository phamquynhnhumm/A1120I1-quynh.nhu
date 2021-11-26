package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.nhanvien.TrinhDo;
import com.example.casestudy_spring.model.entity.taikhoan.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrinhdoRepository extends JpaRepository<TrinhDo, String> {
}
