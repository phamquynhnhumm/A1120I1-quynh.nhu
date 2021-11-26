package com.example.casestudy_spring.model.entity.dichvu;

import javax.persistence.*;
import java.util.List;

@Entity(name = "loaidv")
public class LoaiDV {

    @Id
    @Column(name = "idloai")
    private String idLoaiDV;

    @Column(name = "ten")
    private String tenLoaiDV;
    @OneToMany(mappedBy = "loaiDVs", cascade = CascadeType.ALL)
    private List<DichVu> dichVu;

    public LoaiDV(String idLoaiDV, String tenLoaiDV, List<DichVu> dichVu) {
        this.idLoaiDV = idLoaiDV;
        this.tenLoaiDV = tenLoaiDV;
        this.dichVu = dichVu;
    }

    public String getIdLoaiDV() {
        return idLoaiDV;
    }

    public void setIdLoaiDV(String idLoaiDV) {
        this.idLoaiDV = idLoaiDV;
    }

    public String getTenLoaiDV() {
        return tenLoaiDV;
    }

    public void setTenLoaiDV(String tenLoaiDV) {
        this.tenLoaiDV = tenLoaiDV;
    }

    public List<DichVu> getDichVu() {
        return dichVu;
    }

    public void setDichVu(List<DichVu> dichVu) {
        this.dichVu = dichVu;
    }

    public LoaiDV() {
    }

}
