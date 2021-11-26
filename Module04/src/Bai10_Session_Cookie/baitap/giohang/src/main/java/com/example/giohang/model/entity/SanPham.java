package com.example.giohang.model.entity;

import org.springframework.web.bind.annotation.CookieValue;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity(name = "sanpham")
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSanpham;

    @Column(name = "img")
    private String img;


    @Column(name = "tensp")
    private String ten;

    @Column(name = "gia")
    private Integer gia;

    @Column(name = "soluong")
    private Integer soLuong;

    public SanPham() {
    }

    public Integer getIdSanpham() {
        return idSanpham;
    }

    public void setIdSanpham(Integer idSanpham) {
        this.idSanpham = idSanpham;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
