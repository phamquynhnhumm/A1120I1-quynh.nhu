package com.example.casestudy_spring.model.entity.khachhang;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;

import javax.persistence.*;
import java.util.List;

@Entity(name = "loaikhach")
public class LoaiKhach {
    @Id
    @Column(name = "idLoaiKhach")
    private String idLoaiKhach;

    @Column(name = "tenLoaiKhach")
    private String tenLoaiKhach;


    @OneToMany(mappedBy = "loaiKhach", cascade = CascadeType.ALL)
    private List<KhachHang> Khachhangs;

//    @OneToMany(mappedBy = "loaiKhach",cascade = CascadeType.ALL)
//    private List<KhachHang> khachHangs;

    public LoaiKhach() {
    }

    public LoaiKhach(String idLoaiKhach, String tenLoaiKhach, List<KhachHang> khachhangs) {
        this.idLoaiKhach = idLoaiKhach;
        this.tenLoaiKhach = tenLoaiKhach;
        Khachhangs = khachhangs;
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

    public List<KhachHang> getKhachhangs() {
        return Khachhangs;
    }

    public void setKhachhangs(List<KhachHang> khachhangs) {
        Khachhangs = khachhangs;
    }
}
