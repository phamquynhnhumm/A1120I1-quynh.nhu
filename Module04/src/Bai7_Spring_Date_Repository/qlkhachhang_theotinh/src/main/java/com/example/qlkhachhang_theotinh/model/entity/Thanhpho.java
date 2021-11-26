package com.example.qlkhachhang_theotinh.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "thanhpho")
public class Thanhpho
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tenTp")
    private String tenTp;

    @OneToMany(mappedBy = "thanhpho")
    private List<Khachhang> khachhangList;

    public Thanhpho() {
    }

    public Thanhpho(Integer id, String tenTp, List<Khachhang> khachhangList) {
        this.id = id;
        this.tenTp = tenTp;
        this.khachhangList = khachhangList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenTp() {
        return tenTp;
    }

    public void setTenTp(String tenTp) {
        this.tenTp = tenTp;
    }

    public List<Khachhang> getKhachhangList() {
        return khachhangList;
    }

    public void setKhachhangList(List<Khachhang> khachhangList) {
        this.khachhangList = khachhangList;
    }
}
