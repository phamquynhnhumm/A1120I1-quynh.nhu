package com.example.demo10.model.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class GiaoDich  implements Validator{
    @Id
    @NotEmpty(message = "Vui lòng nhập")
    @Pattern(regexp = "MGD-[0-9]{4}")
    private  String maGiaDich;

    @NotEmpty(message = "Vui lòng nhập")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  String ngayGiaoDich;

    @NotEmpty(message = "Vui chọn loaiji dịch vụ")
    private  String loaiDichvu;

    @Min(value =500000, message = "Đơn giá phải là số và phải lớn hơn 500.000 (VND)")
    private  String donGia;

    @Min(value =20, message = "Diện tích phải lớn hơn 20 m vuông")
    private  Float dientich;

    @ManyToOne
    @JoinColumn(name = "maKhachHang", referencedColumnName = "maKhachHang")
    private  Khachhang dbkhachhang;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaDich, String ngayGiaoDich, String loaiDichvu, String donGia, Float dientich, Khachhang dbkhachhang) {
        this.maGiaDich = maGiaDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.loaiDichvu = loaiDichvu;
        this.donGia = donGia;
        this.dientich = dientich;
        this.dbkhachhang = dbkhachhang;
    }

    public String getMaGiaDich() {
        return maGiaDich;
    }

    public void setMaGiaDich(String maGiaDich) {
        this.maGiaDich = maGiaDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getLoaiDichvu() {
        return loaiDichvu;
    }

    public void setLoaiDichvu(String loaiDichvu) {
        this.loaiDichvu = loaiDichvu;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public Float getDientich() {
        return dientich;
    }

    public void setDientich(Float dientich) {
        this.dientich = dientich;
    }

    public Khachhang getDbkhachhang() {
        return dbkhachhang;
    }

    public void setDbkhachhang(Khachhang dbkhachhang) {
        this.dbkhachhang = dbkhachhang;
    }

    @Override
    public boolean supports(Class<?> clazz) {
      return    GiaoDich.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        GiaoDich giaoDich= (GiaoDich) target;
        String ngayGiaoDich = giaoDich.getNgayGiaoDich();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println("ngày hôm ni  ======" + date);
        Date thoigianbatdau1 = new Date();
        try{
            thoigianbatdau1  = format.parse(ngayGiaoDich);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date.after(thoigianbatdau1)) {
            errors.rejectValue("ngayGiaoDich", "ngayGiaoDich.date");
        }

    }
}
