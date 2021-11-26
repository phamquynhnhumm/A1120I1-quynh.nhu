package com.example.casestudy_spring.model.entity.nhanvien;

import com.example.casestudy_spring.model.entity.hopdong.HopDong;
import org.hibernate.validator.internal.metadata.facets.Cascadable;
import org.hibernate.validator.internal.metadata.facets.Validatable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Entity(name = "nhanvien")
public class NhanVien  implements Validator {
    @Id
    @Column(name = "idnhanvien")
    @NotEmpty(message = "Vui lòng nhập tên")
    @Pattern(regexp = "NV-[0-9]{4}")
    private String idNhanVien;

    @NotBlank
    @NotEmpty(message = "Vui lòng nhập tên")
    @Column(name = "tennhanvien")
    private String tenNhanVien;
//
    @NotEmpty(message = "Vui lòng nhập ngày sinh")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngaySinh", columnDefinition = "DATE")
    private String ngaysinh;

    @Size(max = 12, min = 9,message ="số cmnd phải lớn hơn 9 bé hơn 12 số")
    @Column(name = "socmnd")
    private String socmnd;


    @Size(max = 12, min = 9,message ="số cmnd phải lớn hơn 9 bé hơn 12 số")
    @Column(name = "sdt")
    @Pattern(regexp =  "090[0-9]{7}|091[0-9]{7}|[(]84[)][+]90[0-9]{7}|[(]84[)][+]91[0-9]{7}")
    private String sdt;

    @Email(message = "Vui lòng viết đúng định dạng email")
    @Column(name = "email")
    private String email;

    @Min(value = 1, message = "vui lòng chọn số lượng lớn hơn 0 ")
    @Column(name = "luong")
    private int luong;

    @NotEmpty(message = "Vui lòng nhập thành phố")
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


    @OneToMany(mappedBy = "nhanViens", cascade = CascadeType.ALL)
    private List<HopDong> hopDongList;

    public NhanVien() {
    }

    public NhanVien(String idNhanVien, @NotBlank @NotEmpty(message = "Vui lòng nhập tên") String tenNhanVien, @NotEmpty(message = "Vui lòng nhập ngày sinh") String ngaysinh, @Min(value = 10, message = "số cmnd phải lớn hơn 10 bé hơn 11 số") @Max(value = 12, message = "số cmnd phải lớn hơn 10 bé hơn 11 số") String socmnd, @Min(value = 10, message = "số cmnd phải lớn hơn 10 bé hơn 11 số") @Max(value = 12, message = "số cmnd phải lớn hơn 10 bé hơn 11 số") String sdt, @Email(message = "Vui lòng viết đúng định dạng email") String email, @Min(value = 1, message = "vui lòng chọn số lượng lớn hơn 0 ") int luong, @NotEmpty(message = "Vui lòng nhập thành phố") String thanhpho, ViTri viTri, TrinhDo trinhDo, BoPhan boPhan, List<HopDong> hopDongList) {
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
        this.hopDongList = hopDongList;
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

    public String getSocmnd() {
        return socmnd;
    }

    public void setSocmnd(String socmnd) {
        this.socmnd = socmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
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

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return NhanVien.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object nhanvien, Errors errors) {
        NhanVien nhanVien = (NhanVien) nhanvien;
        String ngaysinh = nhanVien.getNgaysinh();
        String sdt = ((NhanVien) nhanvien).getSdt();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        Date ngaysinh1 = new Date();
        System.out.println("ngày hiện tại  ====" + date);
        try{
            ngaysinh1 = formatter.parse(ngaysinh);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(ngaysinh1.after(date))
        {
            errors.rejectValue("ngaysinh", "ngaysinh.date");

        }

        if (!nhanVien.sdt.startsWith("0")){
            errors.rejectValue("sdt", "number.startsWith");
        }
    }
}
