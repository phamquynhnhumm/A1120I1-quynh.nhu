package com.example.qlkhuyenmai.Model.repository;

import com.example.qlkhuyenmai.Model.entity.KhuyenMai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface KhuyenmaiRepository extends JpaRepository<KhuyenMai, Integer> {
    //    Page<KhuyenMai> findAllByMucgiamgiaContainingAndThoigianbatdauAndThoigianketthuc (Float mucgiamia, String tgbatdau, String tgketthuc, Pageable pageable);
    @Query(value = "select * from khuyen_mai  where mucgiamgia like %?1% and thoigianbatdau like %?2% and thoigianketthuc like %?3%", nativeQuery = true)
    Page<KhuyenMai> timkiem3truong(String mucgiamia, String tgbatdau, String tgketthuc, Pageable pageable);

}