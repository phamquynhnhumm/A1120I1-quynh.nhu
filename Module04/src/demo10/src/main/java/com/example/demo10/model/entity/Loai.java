package com.example.demo10.model.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.List;

@Entity
public class Loai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idLoai;

    private String loaiSanPham;

    @OneToMany (mappedBy = "dbLoai", cascade = CascadeType.ALL)
    private List<SanPham> sanPhamList;

    public Loai() {
    }

    public Loai(Integer idLoai, String loaiSanPham, List<SanPham> sanPhamList) {
        this.idLoai = idLoai;
        this.loaiSanPham = loaiSanPham;
        this.sanPhamList = sanPhamList;
    }

    public Integer getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(Integer idLoai) {
        this.idLoai = idLoai;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public List<SanPham> getSanPhamList() {
        return sanPhamList;
    }

    public void setSanPhamList(List<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }
}
