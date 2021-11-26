package com.example.demo10.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Khachhang {
    @Id
    private  String  maKhachHang ;

    private  String tenKhachHang;

    private  String sdt;

    private  String email;


    @OneToMany(mappedBy = "dbkhachhang", cascade = CascadeType.ALL)
    private List<GiaoDich> giaoDichList;

    public Khachhang() {
    }

    public Khachhang(String maKhachHang, String tenKhachHang, String sdt, String email, List<GiaoDich> giaoDichList) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.sdt = sdt;
        this.email = email;
        this.giaoDichList = giaoDichList;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GiaoDich> getGiaoDichList() {
        return giaoDichList;
    }

    public void setGiaoDichList(List<GiaoDich> giaoDichList) {
        this.giaoDichList = giaoDichList;
    }
}
