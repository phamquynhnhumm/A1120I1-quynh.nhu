package com.example.casestudy_spring.model.entity.dichvu;

import javax.persistence.*;

@Entity(name = "house")
public class House {
    @Id
    @Column(name = "idhouse")
    private String idHouse;

    @Column(name = "tenhouse")
    private String tenHouse;

    @Column(name = "tieuchuanphong")
    private String tieuChuanPhong;

    @Column(name = "mota")
    private String moTa;


    @Column(name = "sotang")
    private int soTang;

    @OneToOne(mappedBy = "houses", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private LoaiDV loaiDV;

    public House() {
    }

    public String getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(String idHouse) {
        this.idHouse = idHouse;
    }

    public String getTenHouse() {
        return tenHouse;
    }

    public void setTenHouse(String tenHouse) {
        this.tenHouse = tenHouse;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public LoaiDV getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(LoaiDV loaiDV) {
        this.loaiDV = loaiDV;
    }
}
