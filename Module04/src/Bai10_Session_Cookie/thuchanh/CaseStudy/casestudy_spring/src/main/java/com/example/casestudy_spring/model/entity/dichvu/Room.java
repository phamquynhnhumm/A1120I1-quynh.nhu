package com.example.casestudy_spring.model.entity.dichvu;

import javax.persistence.*;

@Entity(name = "room")
public class Room {

    @Id
    @Column(name = "idRoom")
    private String idRoom;


    @Column(name = "tenRoom")
    private String tenRoom;

    @Column(name = "tendvpfredikem")
    private String tenDVFreeDiKem;

    @OneToOne(mappedBy = "rooms", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private LoaiDV loaiDV;

    public Room() {
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getTenRoom() {
        return tenRoom;
    }

    public void setTenRoom(String tenRoom) {
        this.tenRoom = tenRoom;
    }

    public String getTenDVFreeDiKem() {
        return tenDVFreeDiKem;
    }

    public void setTenDVFreeDiKem(String tenDVFreeDiKem) {
        this.tenDVFreeDiKem = tenDVFreeDiKem;
    }

    public LoaiDV getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(LoaiDV loaiDV) {
        this.loaiDV = loaiDV;
    }
}
