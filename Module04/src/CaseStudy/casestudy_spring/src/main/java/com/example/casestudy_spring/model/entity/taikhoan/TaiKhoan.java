package com.example.casestudy_spring.model.entity.taikhoan;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TaiKhoan {
    @Id
    @Column(name = "taiKhoan")
    private String taiKhoan;
    private String matKhau;
    private boolean tinhTrang;
    private String ghiChu;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "taikhoan_quyen",
            joinColumns = @JoinColumn(name = "tai_khoan"),
            inverseJoinColumns = @JoinColumn(name = "ma_quyen")
    )
    private Set<Quyen> quyens;



    public TaiKhoan() {
    }

    public TaiKhoan(String taiKhoan, String matKhau, boolean tinhTrang, String ghiChu, Set<Quyen> quyens) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.tinhTrang = tinhTrang;
        this.ghiChu = ghiChu;
        this.quyens = quyens;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Set<Quyen> getQuyens() {
        return quyens;
    }

    public void setQuyens(Set<Quyen> quyens) {
        this.quyens = quyens;
    }
}

