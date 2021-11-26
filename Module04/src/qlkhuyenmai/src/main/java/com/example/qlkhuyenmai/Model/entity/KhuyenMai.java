package com.example.qlkhuyenmai.Model.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class KhuyenMai implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "vui lòng nhập tiêu đề")
    private String tieude;
    @NotEmpty(message = "vui lòng chọn thời gian bắt đầu")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String thoigianbatdau;

    @NotEmpty(message = "vui lòng chọn thời gian kết thúc")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String thoigianketthuc;


    @Min(value = 10000, message = "vui lòng nhập mức gía lớn hơn 10 vnd")
    private Float mucgiamgia;

    @NotEmpty(message = "Vui lòng nhập chi tiết khuyến mãi")
    private String chitiet;

    public KhuyenMai() {
    }

    public KhuyenMai(Integer id, String tieude, String thoigianbatdau, String thoigianketthuc, Float mucgiamgia, String chitiet) {
        this.id = id;
        this.tieude = tieude;
        this.thoigianbatdau = thoigianbatdau;
        this.thoigianketthuc = thoigianketthuc;
        this.mucgiamgia = mucgiamgia;
        this.chitiet = chitiet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getThoigianbatdau() {
        return thoigianbatdau;
    }

    public void setThoigianbatdau(String thoigianbatdau) {
        this.thoigianbatdau = thoigianbatdau;
    }

    public String getThoigianketthuc() {
        return thoigianketthuc;
    }

    public void setThoigianketthuc(String thoigianketthuc) {
        this.thoigianketthuc = thoigianketthuc;
    }

    public Float getMucgiamgia() {
        return mucgiamgia;
    }

    public void setMucgiamgia(Float mucgiamgia) {
        this.mucgiamgia = mucgiamgia;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return KhuyenMai.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        KhuyenMai khuyenMai = (KhuyenMai) target;
        String thoigianbatdau = khuyenMai.getThoigianbatdau();
        String thoigianketthuc = khuyenMai.getThoigianketthuc();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println("ngày hôm ni  ======" + date);
        Date thoigianbatdau1 = new Date();
        Date thoigianbatdau2 = new Date();
        try{
            thoigianbatdau1  = format.parse(thoigianbatdau);
            thoigianbatdau2  = format.parse(thoigianketthuc);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date.after(thoigianbatdau1)) {
            errors.rejectValue("thoigianbatdau", "thoigianbatdau.date");
        }
        if (thoigianbatdau1.after(thoigianbatdau2)) {
            errors.rejectValue("thoigianketthuc", "thoigianketthuc.date");
        }
    }
}
