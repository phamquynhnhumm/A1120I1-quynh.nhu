package com.example.giohang.model.repository;

import com.example.giohang.model.entity.SanPham;
import javafx.beans.property.adapter.JavaBeanProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanphamRepository extends JpaRepository<SanPham, Integer> {
}
