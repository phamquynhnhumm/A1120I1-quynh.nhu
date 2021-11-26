package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class sanpham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer ma;

    private String tensp;

    private  String img;

    public sanpham() {
    }

    public sanpham( sanphamimg sanphamimg) {
    }
    public sanpham(Integer ma, String tensp, String img) {
        this.ma = ma;
        this.tensp = tensp;
        this.img = img;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

   public  static  class    sanphamimg{
       private final String tensp;
       private String image;

       public sanphamimg(String tensp) {
           this.tensp = tensp;
       }
       public sanphamimg  inmge(String image)
       {
           this.image = image;
           return this;
       }
       public  sanpham buid()
       {
           return  new sanpham(this);
       }

   }
}
