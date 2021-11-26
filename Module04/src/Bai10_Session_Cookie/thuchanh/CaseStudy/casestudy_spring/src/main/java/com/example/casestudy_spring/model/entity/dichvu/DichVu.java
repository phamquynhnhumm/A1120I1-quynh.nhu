package com.example.casestudy_spring.model.entity.dichvu;

import com.example.casestudy_spring.model.entity.khachhang.LoaiKhach;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.persistence.*;

@Entity(name = "dichvu")
public class DichVu {
    @Id
    @Column(name = "idDichVu")
    private String idDichVu;

    @Column(name = "ten_dichvu")
    private String tenDichVu;

    @Column(name = "dientich",columnDefinition = "float")
    private Float dienTich;

    @Column(name = "chiphi",columnDefinition = "float")
    private Float chiPhi;

    @Column(name = "songuoi",columnDefinition = "int")
    private Integer soNguoi;

    @ManyToOne
    @JoinColumn(name = "idkieuthue", referencedColumnName = "idkieuthue")
    private KieuThue kieuThues;

    @OneToOne
    @JoinColumn(name = "idloai", referencedColumnName = "idloai", nullable = false)
    private LoaiDV loaiDVs;

    public DichVu() {
    }

    public DichVu(String idDichVu, String tenDichVu, Float dienTich, Float chiPhi, Integer soNguoi, KieuThue kieuThues, LoaiDV loaiDVs) {
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soNguoi = soNguoi;
        this.kieuThues = kieuThues;
        this.loaiDVs = loaiDVs;
    }

    public String getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(String idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Float getDienTich() {
        return dienTich;
    }

    public void setDienTich(Float dienTich) {
        this.dienTich = dienTich;
    }

    public Float getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(Float chiPhi) {
        this.chiPhi = chiPhi;
    }

    public Integer getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(Integer soNguoi) {
        this.soNguoi = soNguoi;
    }

    public KieuThue getKieuThues() {
        return kieuThues;
    }

    public void setKieuThues(KieuThue kieuThues) {
        this.kieuThues = kieuThues;
    }

    public LoaiDV getLoaiDVs() {
        return loaiDVs;
    }

    public void setLoaiDVs(LoaiDV loaiDVs) {
        this.loaiDVs = loaiDVs;
    }
}
