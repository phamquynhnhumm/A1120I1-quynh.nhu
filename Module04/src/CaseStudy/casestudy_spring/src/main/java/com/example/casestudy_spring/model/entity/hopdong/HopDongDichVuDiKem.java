package com.example.casestudy_spring.model.entity.hopdong;

import com.example.casestudy_spring.model.entity.dichvu.DichVu;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;

import javax.persistence.*;

@Entity(name = "hopdongdichvudikem")
public class HopDongDichVuDiKem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @ManyToOne
    @JoinColumn(name = "idHopDong", referencedColumnName = "idHopDong")
    private HopDong hopDongs;

    @ManyToOne
    @JoinColumn(name = "idDVDiKem", referencedColumnName = "idDVDiKem")
    private DichVuDiKem dichVuDiKems;

    public HopDongDichVuDiKem() {
    }

    public HopDongDichVuDiKem(Integer id, HopDong hopDongs, DichVuDiKem dichVuDiKems) {
        this.id = id;
        this.hopDongs = hopDongs;
        this.dichVuDiKems = dichVuDiKems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HopDong getHopDongs() {
        return hopDongs;
    }

    public void setHopDongs(HopDong hopDongs) {
        this.hopDongs = hopDongs;
    }

    public DichVuDiKem getDichVuDiKems() {
        return dichVuDiKems;
    }

    public void setDichVuDiKems(DichVuDiKem dichVuDiKems) {
        this.dichVuDiKems = dichVuDiKems;
    }
}
