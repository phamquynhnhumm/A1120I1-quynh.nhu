package com.example.demo10.model.repository;

import com.example.demo10.model.entity.GiaoDich;
import com.example.demo10.model.entity.Loai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GiaoDichRepository extends JpaRepository<GiaoDich, String> {
//    List<GiaoDich> findByLoaiDichvuAndDbkhachhang (String loai dv, String tenkhachhang);
@Query(value="select * from giao_dich where loai_dichvu like %?1% and ma_khach_hang like %?2%",nativeQuery=true)
List<GiaoDich> timkiem2truong(String loai, String makhachhang);

}
