package com.example.casestudy_spring.model.entity.nhanvien;

import com.example.casestudy_spring.model.entity.taikhoan.User;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "idnhanvien")
    private String idNhanVien;

    @Column(name = "tennhanvien")
    private String tenNhanVien;

    @Column(name = "ngaysinh", columnDefinition = "DATE")
    private String ngaysinh;

    @Column(name = "socmnd")
    private Integer socmnd;

    @Column(name = "sdt")
    private Integer sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "luong")
    private int luong;

    @Column(name = "thanhpho")
    private String thanhpho;

    @ManyToOne
    @JoinColumn(name = "vitri_Id", referencedColumnName = "vitriId")
    private ViTri viTri;

    @ManyToOne
    @JoinColumn(name = "trinhDo_id", referencedColumnName = "idTrinhDo")
    private TrinhDo trinhDo;

    @ManyToOne
    @JoinColumn(name = "bophan_id", referencedColumnName = "idBoPhan")
    private BoPhan boPhan;

    @OneToOne(mappedBy = "nhanVienList", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User Usermap;


    public NhanVien() {
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Integer getSocmnd() {
        return socmnd;
    }

    public void setSocmnd(Integer socmnd) {
        this.socmnd = socmnd;
    }

    public Integer getSdt() {
        return sdt;
    }

    public void setSdt(Integer sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public BoPhan getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(BoPhan boPhan) {
        this.boPhan = boPhan;
    }

    public User getUsermap() {
        return Usermap;
    }

    public void setUsermap(User usermap) {
        Usermap = usermap;
    }

    public NhanVien(String idNhanVien, String tenNhanVien, String ngaysinh, Integer socmnd, Integer sdt, String email, int luong, String thanhpho, ViTri viTri, TrinhDo trinhDo, BoPhan boPhan, User usermap) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngaysinh = ngaysinh;
        this.socmnd = socmnd;
        this.sdt = sdt;
        this.email = email;
        this.luong = luong;
        this.thanhpho = thanhpho;
        this.viTri = viTri;
        this.trinhDo = trinhDo;
        this.boPhan = boPhan;
        Usermap = usermap;
    }
}
