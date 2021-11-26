package com.example.demo;

import org.springframework.web.multipart.MultipartFile;

public class sanphamimgform {
    private Integer id;
    private String tensp;
    private MultipartFile image;

    public sanphamimgform(Integer id, String tensp, MultipartFile image) {
        this.id = id;
        this.tensp = tensp;
        this.image = image;
    }

    public sanphamimgform() {
    }
    public sanphamimgform(sanphamFormbui sanphamFormbui) {
        this.tensp = sanphamFormbui.tensp;
        this.image = sanphamFormbui.image;
    }

   public  static  class sanphamFormbui{
       private final String tensp;
       private MultipartFile image;

       public sanphamFormbui(String  tensp) {
           this.tensp =  tensp;
       }
       public sanphamFormbui image(MultipartFile image) {
           this.image = image;
           return  this;
       }
       public  sanphamimgform build()

       {
           return  new sanphamimgform();
       }

   }
    public Integer getId() {
        return id;
    }
    public sanphamimgform(String tensp) {
        this.tensp = tensp;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
