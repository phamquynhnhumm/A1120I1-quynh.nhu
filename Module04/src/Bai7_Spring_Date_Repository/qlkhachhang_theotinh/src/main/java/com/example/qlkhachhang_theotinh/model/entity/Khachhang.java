package com.example.qlkhachhang_theotinh.model.entity;

import javax.persistence.*;

@Entity(name = "khachhang")
public class Khachhang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ngaysinh", columnDefinition = "DATE")
    private String ngaysinh;

    @Column(name = "sdt")
    private Integer sdt;

    @ManyToOne
    @JoinColumn(name = "thanhpho_id", referencedColumnName = "id")
    private Thanhpho thanhpho;

    public Khachhang() {
    }

    public Khachhang(Integer id, String ten, String ngaysinh, Integer sdt, Thanhpho thanhpho) {
        this.id = id;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.thanhpho = thanhpho;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSdt() {
        return sdt;
    }

    public void setSdt(Integer sdt) {
        this.sdt = sdt;
    }

    public Thanhpho getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(Thanhpho thanhpho) {
        this.thanhpho = thanhpho;
    }
}
