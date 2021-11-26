package com.example.casestudy_spring.model.entity.dichvu;


import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.entity.khachhang.LoaiKhach;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "kieuthue")
public class KieuThue {

    @Id
    @Column(name = "idkieuthue")
    private String idKieuThue;


    @Column(name = "tenkieuthue")
    private  String tenKieuThue;

    @OneToMany(mappedBy = "kieuThues")
    private List<DichVu> dichVus;

    public KieuThue() {

    }

    public KieuThue(String idKieuThue, String tenKieuThue, List<DichVu> dichVus) {
        this.idKieuThue = idKieuThue;
        this.tenKieuThue = tenKieuThue;
        this.dichVus = dichVus;
    }

    public String getIdKieuThue() {
        return idKieuThue;
    }

    public void setIdKieuThue(String idKieuThue) {
        this.idKieuThue = idKieuThue;
    }

    public String getTenKieuThue() {
        return tenKieuThue;
    }

    public void setTenKieuThue(String tenKieuThue) {
        this.tenKieuThue = tenKieuThue;
    }

    public List<DichVu> getDichVus() {
        return dichVus;
    }

    public void setDichVus(List<DichVu> dichVus) {
        this.dichVus = dichVus;
    }
}
