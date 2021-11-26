package com.example.casestudy_spring.model.entity.dichvu;

import com.example.casestudy_spring.model.entity.taikhoan.User;

import javax.persistence.*;
import java.util.List;

@Entity(name = "villa")
public class Villa {
    @Id
    @Column(name = "idVilla")
    private String idVilla;

    @Column(name = "tenVilla")
    private String tenVilla;

    @Column(name = "tieuchuanphong")
    private String tieuChuanPhong;

    @Column(name = "mota")
    private String moTa;
    @Column(name = "dientichhoboi")
    private Float dienTichHoBoi;
    @Column(name = "sotang")
    private int soTang;


    @OneToOne(mappedBy = "villas", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private LoaiDV loaiDV;

    public Villa() {
    }

    public String getIdVilla() {
        return idVilla;
    }

    public void setIdVilla(String idVilla) {
        this.idVilla = idVilla;
    }

    public String getTenVilla() {
        return tenVilla;
    }

    public void setTenVilla(String tenVilla) {
        this.tenVilla = tenVilla;
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

    public Float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(Float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
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
