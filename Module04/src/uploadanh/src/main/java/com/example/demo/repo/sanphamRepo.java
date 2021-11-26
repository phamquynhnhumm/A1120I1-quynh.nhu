package com.example.demo.repo;

import com.example.demo.sanpham;
import javafx.beans.property.adapter.JavaBeanProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface sanphamRepo extends JpaRepository<sanpham, Integer> {
}
