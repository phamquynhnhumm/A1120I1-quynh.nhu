package com.example.casestudy_spring.model.entity.khachhang;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "loaikhach")
public class LoaiKhach {

    @Id
    @Column(name = "idloaikhac")
    private String idLoaiKhach;

    @Column(name = "tenLoaiKhach")
    private String tenLoaiKhach;

    @OneToMany(mappedBy = "loaiKhach")
    private List<KhachHang> khachHangs;

    public LoaiKhach() {
    }

    public LoaiKhach(String idLoaiKhach, String tenLoaiKhach, List<KhachHang> khachHangs) {
        this.idLoaiKhach = idLoaiKhach;
        this.tenLoaiKhach = tenLoaiKhach;
        this.khachHangs = khachHangs;
    }

    public String getIdLoaiKhach() {
        return idLoaiKhach;
    }

    public void setIdLoaiKhach(String idLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
    }

    public String getTenLoaiKhach() {
        return tenLoaiKhach;
    }

    public void setTenLoaiKhach(String tenLoaiKhach) {
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public List<KhachHang> getKhachHangs() {
        return khachHangs;
    }

    public void setKhachHangs(List<KhachHang> khachHangs) {
        this.khachHangs = khachHangs;
    }
}
