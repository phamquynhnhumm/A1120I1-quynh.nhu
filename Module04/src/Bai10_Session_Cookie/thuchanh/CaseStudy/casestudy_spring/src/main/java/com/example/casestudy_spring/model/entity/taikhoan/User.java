package com.example.casestudy_spring.model.entity.taikhoan;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "user")
public class User {
    @Id
    @Column(name = "tenuser")
    private String tenUser;

    @Column(name = "matkhau")
    private String matKhau;

    @ManyToMany(mappedBy = "userSet")
    private  Set<VaiTro> vaiTros;



    @OneToOne
    @JoinColumn(name = "nhanvien_id", referencedColumnName = "idnhanvien", nullable = false)
    private NhanVien nhanVienList;

    public User() {
    }

    public User(String tenUser, String matKhau, Set<VaiTro> vaiTros, NhanVien nhanVienList) {
        this.tenUser = tenUser;
        this.matKhau = matKhau;
        this.vaiTros = vaiTros;
        this.nhanVienList = nhanVienList;
    }

    public String getTenUser() {
        return tenUser;
    }

    public void setTenUser(String tenUser) {
        this.tenUser = tenUser;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Set<VaiTro> getVaiTros() {
        return vaiTros;
    }

    public void setVaiTros(Set<VaiTro> vaiTros) {
        this.vaiTros = vaiTros;
    }

    public NhanVien getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(NhanVien nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
