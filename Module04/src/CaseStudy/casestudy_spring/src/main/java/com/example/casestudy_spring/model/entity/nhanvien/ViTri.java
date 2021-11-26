package com.example.casestudy_spring.model.entity.nhanvien;

import javax.persistence.*;
import java.util.List;

@Entity(name = "vitri")
public class ViTri {

    @Id
    @Column(name = "vitriId")
    private String viTriId;

    @Column(name = "tenViTri")
    private String tenViTri;

    @OneToMany(mappedBy = "viTri", cascade = CascadeType.ALL)
    private List<NhanVien> nhanVienList;

    public ViTri(String viTriId, String tenViTri, List<NhanVien> nhanVienList) {
        this.viTriId = viTriId;
        this.tenViTri = tenViTri;
        this.nhanVienList = nhanVienList;
    }

    public ViTri() {
    }

    public String getViTriId() {
        return viTriId;
    }

    public void setViTriId(String viTriId) {
        this.viTriId = viTriId;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
