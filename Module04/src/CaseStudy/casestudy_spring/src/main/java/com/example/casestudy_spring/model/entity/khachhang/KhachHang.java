package com.example.casestudy_spring.model.entity.khachhang;


import com.example.casestudy_spring.model.entity.hopdong.HopDong;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity(name = "khachhang")
public class KhachHang implements Validator {
    @Id
    @Column(name = "khachHangId")
    @NotEmpty(message = "Vui lòng nhập id")
    @Pattern(regexp = "[KH-[0-9]{4}]")
    private String khachHangId;


    @NotEmpty(message = "Vui lòng nhập tên")
    @NotBlank
    @Column(name = "ten_khachhang")
    private String ten;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngaysinh_khachhang", columnDefinition = "DATE")
    private String ngaysinh;

//    @NotEmpty(message = "Vui lòng  chọn giới tính")
    @Column(name = "gioitinh")
    private int gioiTinh;


    @Size(max = 12, min = 9, message = "số cmnd phải lớn hơn 9 bé hơn 12 số")
    @Column(name = "socmnd")
    private String socmnd;

//    @Size(max = 12, min = 9, message = "số đt phải lớn hơn 9 bé hơn 12 số")
//    @Column(name = "sdt")
//    private String sdt;

    @Email(message = "vui lòng nhập đúng định dạng email")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "Vui lòng Nhập thành phố")
    @Column(name = "thanhpho")
    private String thanhPho;


    @ManyToOne
    @JoinColumn(name = "id_LoaiKhach", referencedColumnName = "idLoaiKhach")
    private LoaiKhach loaiKhach;


    @OneToMany(mappedBy = "khachHangs", cascade = CascadeType.ALL)
    private List<HopDong> hopDongList;
//    @OneToMany(mappedBy = "khachHangs")
//    private List<HopDong> hopDongList;

    public KhachHang() {
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return KhachHang.class.isAssignableFrom(clazz);
    }

    public KhachHang(@NotEmpty(message = "Vui lòng nhập id") String khachHangId, @NotEmpty(message = "Vui lòng nhập tên") @NotBlank String ten, String ngaysinh, int gioiTinh, @Size(max = 12, min = 9, message = "số cmnd phải lớn hơn 9 bé hơn 12 số") String socmnd, @Email(message = "vui lòng nhập đúng định dạng email") String email, @NotEmpty(message = "Vui lòng Nhập thành phố") String thanhPho, LoaiKhach loaiKhach, List<HopDong> hopDongList) {
        this.khachHangId = khachHangId;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioiTinh = gioiTinh;
        this.socmnd = socmnd;
        this.email = email;
        this.thanhPho = thanhPho;
        this.loaiKhach = loaiKhach;
        this.hopDongList = hopDongList;
    }

    public String getKhachHangId() {
        return khachHangId;
    }

    public void setKhachHangId(String khachHangId) {
        this.khachHangId = khachHangId;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSocmnd() {
        return socmnd;
    }

    public void setSocmnd(String socmnd) {
        this.socmnd = socmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

    @Override
    public void validate(Object target, Errors errors) {
        KhachHang khachHang = (KhachHang) target;
        String ngaysinh = khachHang.getNgaysinh();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        Date ngaysinh1 = new Date();
        System.out.println("ngày hiện tại  ====" + date);
        System.out.println("ngày sinh 111 ====" + ngaysinh1);
        try{
            ngaysinh1 = formatter.parse(ngaysinh);
            System.out.println("ngayf sisnh bn nhap" + ngaysinh1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (ngaysinh1.after(date)) {
            errors.rejectValue("ngaysinh", "ngaysinh1.date");
        }
    }
}
