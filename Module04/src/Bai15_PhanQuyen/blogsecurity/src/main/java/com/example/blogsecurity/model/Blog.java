package com.example.blogsecurity.model;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "noidung")
    private String noidung;

    public Blog(Integer id, String noidung) {
        this.id = id;
        this.noidung = noidung;
    }

    public Integer getId() {
        return id;
    }

    public Blog() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
