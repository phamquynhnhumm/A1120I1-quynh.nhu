package com.example.ql_hocsinh.model.entity;


import javax.persistence.*;

@Entity(name = "hocsinh")
public class Hocsinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ngaysinh", columnDefinition = "DATE")
    private String ngaysinh;

    @Column(name = "gioitinh")
    private Double gioitinh;

    @ManyToOne
    @JoinColumn(name = "lop_id", referencedColumnName = "id")
    private Lop lophoc;

    public Lop getLophoc() {
        return lophoc;
    }

    public void setLophoc(Lop lophoc) {
        this.lophoc = lophoc;
    }

    public Hocsinh() {
    }

    public Hocsinh(Integer id, String ten, String ngaysinh, Double gioitinh) {
        this.id = id;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
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

    public Double getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Double gioitinh) {
        this.gioitinh = gioitinh;
    }
}
