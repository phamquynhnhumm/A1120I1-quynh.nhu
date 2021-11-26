package com.example.demo10.model.entity;

import org.hibernate.service.spi.InjectService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class SanPham  implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @NotEmpty(message = "vui lòng nhập tên sản phẩm")
    private  String tenSanPham;

    @NotEmpty(message = "vui lòng ngày")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  String ngaynhap;

    @Min(value = 1, message = "Vui lòng nhập giá klowns hohw 1")
    private  double tien;

    @ManyToOne
    @JoinColumn(name = "idLoai", referencedColumnName = "idLoai")
    private  Loai dbLoai;


    public SanPham() {
    }

    public SanPham(Integer id, String tenSanPham, String ngaynhap, double tien, Loai dbLoai) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.ngaynhap = ngaynhap;
        this.tien = tien;
        this.dbLoai = dbLoai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public Loai getDbLoai() {
        return dbLoai;
    }

    public void setDbLoai(Loai dbLoai) {
        this.dbLoai = dbLoai;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return SanPham.class.isAssignableFrom(clazz);    }

    @Override
    public void validate(Object target, Errors errors) {
       SanPham sanPham= (SanPham) target;

       String thoigian  = sanPham.getNgaynhap();
//        String thoigianbatdau = khuyenMai.getThoigianbatdau();
//        String thoigianketthuc = khuyenMai.getThoigianketthuc();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println("ngày hôm ni  ======" + date);
        Date thoigianbatdau1 = new Date();
        try{
            thoigianbatdau1  = format.parse(thoigian);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date.after(thoigianbatdau1)) {
            errors.rejectValue("ngaynhap", "ngaynhap.date");
        }

    }
}
