package com.example.casestudy_spring.model.entity.nhanvien;

import org.hibernate.annotations.Cascade;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Entity(name = "trinhdo")
public class TrinhDo {

    @Id
    @Column(name = "idTrinhDo")
    private String idTrinhDo;

    @Column(name = "tenTrinhDo")
    private String tenTrinhDo;

    @OneToMany(mappedBy = "trinhDo")
//    @Cascade(value= {org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE})
    private List<NhanVien> nhanVienList;

    public TrinhDo() {
    }

    public TrinhDo(String idTrinhDo, String tenTrinhDo, List<NhanVien> nhanVienList) {
        this.idTrinhDo = idTrinhDo;
        this.tenTrinhDo = tenTrinhDo;
        this.nhanVienList = nhanVienList;
    }

    public String getIdTrinhDo() {
        return idTrinhDo;
    }

    public void setIdTrinhDo(String idTrinhDo) {
        this.idTrinhDo = idTrinhDo;
    }

    public String getTenTrinhDo() {
        return tenTrinhDo;
    }

    public void setTenTrinhDo(String tenTrinhDo) {
        this.tenTrinhDo = tenTrinhDo;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
