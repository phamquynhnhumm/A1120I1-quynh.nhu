package com.example.ql_hocsinh.model.entity;

import javax.persistence.*;

@Entity(name = "hocsinh")
public class Hocsinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ngaysinh",columnDefinition = "DATE")
    private String ngaysinh;

    @Column(name = "std")
    private Integer sdt;

    @ManyToOne
    @JoinColumn(name = "lop_id", referencedColumnName = "id")
    private LopHoc lophoc;

    public Hocsinh() {
    }

    public Hocsinh(Integer id, String ten, String ngaysinh, Integer sdt, LopHoc lophoc) {
        this.id = id;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.lophoc = lophoc;
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

    public LopHoc getLophoc() {
        return lophoc;
    }

    public void setLophoc(LopHoc lophoc) {
        this.lophoc = lophoc;
    }
}
