package com.example.casestudy_spring.model.entity.hopdong;


import com.example.casestudy_spring.model.entity.dichvu.DichVu;
import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity(name = "hopdong")
public class HopDong implements Validator {

    @Id
    @Column(name = "idHopDong")
    @Pattern(regexp = "HD-[0-9]{4}")
    private String idHopDong;

    @NotEmpty(message = "Vui lòng nhập ngày  bắt đầu")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngaybatdau")
    private String ngayBatDau;

    @NotEmpty(message = "Vui lòng nhập ngày  bắt đầu")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngayketthuc")
    private String ngayKetThuc;

    @Min(value = 1, message = "số tiền đặt cọ phải lớn hơn 1")
    @Column(name = "sotiendatcoc")
    private Float soTienDatCoc;

    @Min(value = 1, message = "tổng tiền  phải lớn hơn 1")
    @Column(name = "tongsotienthanhtoan")
    private Float tongSoTienThanhToan;

    @ManyToOne
    @JoinColumn(name = "idNhanVien", referencedColumnName = "idNhanVien")
    private NhanVien nhanViens;

    @ManyToOne
    @JoinColumn(name = "idDichVu", referencedColumnName = "idDichVu")
    private DichVu dichVus;

//    @ManyToOne
//    @JoinColumn(name = "khachHangId", referencedColumnName = "khachHangId")
//    private KhachHang khachHangs;

    @ManyToOne
    @JoinColumn(name = "khachhang_id", referencedColumnName = "khachHangId")
    private KhachHang khachHangs;


    @OneToMany(mappedBy = "hopDongs", cascade = CascadeType.ALL)
    private List<HopDongDichVuDiKem> hopDongDichVuDiKemList;


    public HopDong() {
    }

    public HopDong(String idHopDong, String ngayBatDau, String ngayKetThuc, Float soTienDatCoc, Float tongSoTienThanhToan, NhanVien nhanViens, DichVu dichVus, KhachHang khachHangs, List<HopDongDichVuDiKem> hopDongDichVuDiKemList) {
        this.idHopDong = idHopDong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soTienDatCoc = soTienDatCoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
        this.nhanViens = nhanViens;
        this.dichVus = dichVus;
        this.khachHangs = khachHangs;
        this.hopDongDichVuDiKemList = hopDongDichVuDiKemList;
    }

    public String getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(String idHopDong) {
        this.idHopDong = idHopDong;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Float getSoTienDatCoc() {
        return soTienDatCoc;
    }

    public void setSoTienDatCoc(Float soTienDatCoc) {
        this.soTienDatCoc = soTienDatCoc;
    }

    public Float getTongSoTienThanhToan() {
        return tongSoTienThanhToan;
    }

    public void setTongSoTienThanhToan(Float tongSoTienThanhToan) {
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    public NhanVien getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien nhanViens) {
        this.nhanViens = nhanViens;
    }

    public DichVu getDichVus() {
        return dichVus;
    }

    public void setDichVus(DichVu dichVus) {
        this.dichVus = dichVus;
    }

    public KhachHang getKhachHangs() {
        return khachHangs;
    }

    public void setKhachHangs(KhachHang khachHangs) {
        this.khachHangs = khachHangs;
    }

    public List<HopDongDichVuDiKem> getHopDongDichVuDiKemList() {
        return hopDongDichVuDiKemList;
    }

    public void setHopDongDichVuDiKemList(List<HopDongDichVuDiKem> hopDongDichVuDiKemList) {
        this.hopDongDichVuDiKemList = hopDongDichVuDiKemList;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return HopDong.class.isAssignableFrom(clazz);
    }


    @Override
    public void validate(Object hopdong, Errors errors) {
        HopDong hopDong = (HopDong) hopdong;
        String ngayBatDau = hopDong.getNgayBatDau();
        String ngayKetThuc = hopDong.getNgayKetThuc();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");

        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        Date ngaybatdau1 = new Date();
        Date ngaybatdau2 = new Date();
        System.out.println("ngày hiện tại  ====" + date);
        System.out.println("ngày hiện bắt đầu  ====" + ngaybatdau1);

        try {
            ngaybatdau1 = formatter.parse(ngayBatDau);
            ngaybatdau2 = formatter1.parse(ngayKetThuc);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date.after(ngaybatdau1)) {
            errors.rejectValue("ngayBatDau", "ngaybatdau.date");
        }
        if (ngaybatdau1.after(ngaybatdau2)) {
            errors.rejectValue("ngayKetThuc", "ngayketthuc.date");
        }
//
//        if (!nhanVien.sdt.startsWith("0")) {
//            errors.rejectValue("sdt", "number.startsWith");
//        }
    }
}