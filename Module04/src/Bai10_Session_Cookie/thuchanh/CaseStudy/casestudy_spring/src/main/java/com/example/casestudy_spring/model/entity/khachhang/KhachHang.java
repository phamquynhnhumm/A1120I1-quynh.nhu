package com.example.casestudy_spring.model.entity.khachhang;


import com.example.casestudy_spring.model.entity.nhanvien.ViTri;

import javax.persistence.*;

@Entity(name = "khachhang")
public class KhachHang {

    @Id
    @Column(  name = "id_khachhang")
    private String khachHangId;

    @Column( name = "ten_khachhang")
    private String ten;

    @Column(name = "ngaysinh_khachhang",columnDefinition = "DATE")
    private String ngaysinh;

    @Column(name = "gioitinh")
    private Integer gioiTinh;

    @Column(name = "socmnd")
    private Integer socmnd;


    @Column(name = "sdt")
    private Integer sdt;

    @Column( name = "email")
    private String email;

    @Column( name = "thanhpho")
    private String thanhPho;

    @ManyToOne
    @JoinColumn(name = "idloaikhac", referencedColumnName = "idloaikhac")
    private LoaiKhach loaiKhach;

    public KhachHang() {
    }

    public KhachHang(String khachHangId, String ten, String ngaysinh, Integer gioiTinh, Integer socmnd, Integer sdt, String email, String thanhPho, LoaiKhach loaiKhach) {
        this.khachHangId = khachHangId;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioiTinh = gioiTinh;
        this.socmnd = socmnd;
        this.sdt = sdt;
        this.email = email;
        this.thanhPho = thanhPho;
        this.loaiKhach = loaiKhach;
    }

    public String getKhachHangId() {
        return khachHangId;
    }

    public void setKhachHangId(String khachHangId) {
        this.khachHangId = khachHangId;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getSocmnd() {
        return socmnd;
    }

    public void setSocmnd(Integer socmnd) {
        this.socmnd = socmnd;
    }

    public Integer getSdt() {
        return sdt;
    }

    public void setSdt(Integer sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }
}
