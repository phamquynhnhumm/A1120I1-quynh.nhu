package com.example.casestudy_spring.model.entity.dichvu;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;

@Entity(name = "loaidv")
public class LoaiDV {

    @Id
    @Column(name = "idloai")
    private String idLoaiDV;

    @Column(name = "ten")
    private String tenLoaiDV;

    @OneToOne
    @JoinColumn(name = "idVilla", referencedColumnName = "idVilla", nullable = false)
    private Villa villas;

    @OneToOne
    @JoinColumn(name = "idhouse", referencedColumnName = "idhouse", nullable = false)
    private House houses;

    @OneToOne
    @JoinColumn(name = "idRoom", referencedColumnName = "idRoom", nullable = false)
    private Room rooms;

    @OneToOne(mappedBy = "loaiDVs", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private DichVu dichVu;

    public LoaiDV() {

    }

    public String getIdLoaiDV() {
        return idLoaiDV;
    }

    public void setIdLoaiDV(String idLoaiDV) {
        this.idLoaiDV = idLoaiDV;
    }

    public String getTenLoaiDV() {
        return tenLoaiDV;
    }

    public void setTenLoaiDV(String tenLoaiDV) {
        this.tenLoaiDV = tenLoaiDV;
    }

    public Villa getVillas() {
        return villas;
    }

    public void setVillas(Villa villas) {
        this.villas = villas;
    }

    public House getHouses() {
        return houses;
    }

    public void setHouses(House houses) {
        this.houses = houses;
    }

    public Room getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
}
