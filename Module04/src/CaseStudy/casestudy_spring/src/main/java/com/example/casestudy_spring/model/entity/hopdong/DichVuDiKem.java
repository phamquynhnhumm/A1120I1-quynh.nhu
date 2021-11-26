package com.example.casestudy_spring.model.entity.hopdong;

import javax.persistence.*;
import java.util.List;

@Entity(name = "dichvudikem")
public class DichVuDiKem {
    @Id
    @Column(name = "idDVDiKem")
    private String idDVDiKem;

    @Column(name = "tendvdikem")
    private String tenDVDiKem;

    @Column(name = "dongia")
    private  String donGia;

    @Column(name = "tien")
    private  float tien;

    @OneToMany(mappedBy = "dichVuDiKems", cascade = CascadeType.ALL)
    private List<HopDongDichVuDiKem> hopDongDichVuDiKemList;


    public DichVuDiKem() {
    }

    public DichVuDiKem(String idDVDiKem, String tenDVDiKem, String donGia, float tien, List<HopDongDichVuDiKem> hopDongDichVuDiKemList) {
        this.idDVDiKem = idDVDiKem;
        this.tenDVDiKem = tenDVDiKem;
        this.donGia = donGia;
        this.tien = tien;
        this.hopDongDichVuDiKemList = hopDongDichVuDiKemList;
    }

    public String getIdDVDiKem() {
        return idDVDiKem;
    }

    public void setIdDVDiKem(String idDVDiKem) {
        this.idDVDiKem = idDVDiKem;
    }

    public String getTenDVDiKem() {
        return tenDVDiKem;
    }

    public void setTenDVDiKem(String tenDVDiKem) {
        this.tenDVDiKem = tenDVDiKem;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public float getTien() {
        return tien;
    }

    public void setTien(float tien) {
        this.tien = tien;
    }

    public List<HopDongDichVuDiKem> getHopDongDichVuDiKemList() {
        return hopDongDichVuDiKemList;
    }

    public void setHopDongDichVuDiKemList(List<HopDongDichVuDiKem> hopDongDichVuDiKemList) {
        this.hopDongDichVuDiKemList = hopDongDichVuDiKemList;
    }
}
