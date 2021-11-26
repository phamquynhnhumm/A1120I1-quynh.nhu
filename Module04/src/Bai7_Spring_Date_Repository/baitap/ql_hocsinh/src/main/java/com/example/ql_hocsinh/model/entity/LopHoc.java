package com.example.ql_hocsinh.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "lophoc")
public class LopHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tenlop")
    private String tenlop;

    @OneToMany(mappedBy = "lophoc")
    private List<Hocsinh> hocSinhList;

    public LopHoc(Integer id, String tenlop, List<Hocsinh> hocSinhList) {
        this.id = id;
        this.tenlop = tenlop;
        this.hocSinhList = hocSinhList;
    }

    public LopHoc() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public List<Hocsinh> getHocSinhList() {
        return hocSinhList;
    }

    public void setHocSinhList(List<Hocsinh> hocSinhList) {
        this.hocSinhList = hocSinhList;
    }
}
