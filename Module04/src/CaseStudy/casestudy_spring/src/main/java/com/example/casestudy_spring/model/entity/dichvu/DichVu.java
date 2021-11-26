package com.example.casestudy_spring.model.entity.dichvu;

import com.example.casestudy_spring.model.entity.hopdong.HopDong;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity(name = "dichvu")
public class DichVu {
    @Id
    @Column(name = "idDichVu")
    @NotEmpty(message = "Vui lòng nhập tên")
    @Pattern(regexp = "DV-[0-9]{4}")
    private String idDichVu;

    @NotEmpty(message = "Vui lòng nhập mã dịch vụ")
    @Column(name = "ten_dichvu")
    private String tenDichVu;

    @Min(value = 1)
    @Column(name = "dientich",columnDefinition = "float")
    private Float dienTich;

    @Min(value = 1)
    @Column(name = "chiphi",columnDefinition = "float")
    private Float chiPhi;

    @Min(value = 1)
    @Column(name = "songuoi",columnDefinition = "int")
    private Integer soNguoi;

    @ManyToOne
    @JoinColumn(name = "idkieuthue", referencedColumnName = "idkieuthue")
    private KieuThue kieuThues;

    @ManyToOne
    @JoinColumn(name = "idloai", referencedColumnName = "idloai")
    private LoaiDV loaiDVs;

    @OneToMany(mappedBy = "dichVus", cascade = CascadeType.ALL)
    private List<HopDong> hopDongList;

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

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
