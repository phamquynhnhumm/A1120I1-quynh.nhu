package com.example.demo;

public class Infor {
    private  String name;
    private String photp;

    public Infor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotp() {
        return photp;
    }

    public void setPhotp(String photp) {
        this.photp = photp;
    }

    public Infor(String name, String photp) {
        this.name = name;
        this.photp = photp;
    }
}
