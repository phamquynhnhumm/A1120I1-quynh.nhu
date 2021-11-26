package com.example.casestudy_spring.model.entity.nhanvien;

import javax.persistence.*;
import java.util.List;

@Entity(name = "bophan")
public class BoPhan {

    @Id
    @Column(name = "idBoPhan")
    private String idBoPhan;

    @Column(name = "tenBoPhan")
    private String tenBoPhan;

    @OneToMany(mappedBy = "boPhan", cascade = CascadeType.ALL)
    private List<NhanVien> nhanVienList;

    public BoPhan() {
    }

    public String getIdBoPhan() {
        return idBoPhan;
    }

    public BoPhan(String idBoPhan, String tenBoPhan, List<NhanVien> nhanVienList) {
        this.idBoPhan = idBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.nhanVienList = nhanVienList;
    }

    public void setIdBoPhan(String idBoPhan) {
        this.idBoPhan = idBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
