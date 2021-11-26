package com.example.ql_hocsinh.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "lop")
public class Lop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_lop")
    private String tenLop;

    @OneToMany(mappedBy = "lophoc")
    private List<Hocsinh> hocsinhList;

    public Lop(Integer id, String tenLop, List<Hocsinh> hocsinhList) {
        this.id = id;
        this.tenLop = tenLop;
        this.hocsinhList = hocsinhList;
    }

    public Lop() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public List<Hocsinh> getHocsinhList() {
        return hocsinhList;
    }

    public void setHocsinhList(List<Hocsinh> hocsinhList) {
        this.hocsinhList = hocsinhList;
    }
}
