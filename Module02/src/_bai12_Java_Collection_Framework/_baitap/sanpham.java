package _bai12_Java_Collection_Framework._baitap;

import _bai12_Java_Collection_Framework.on_tap.Person;

import java.util.List;

public class sanpham {
     private  String ten;
     private  int id;
     private double tien;

    public sanpham(String ten, int id, double tien) {
        this.ten = ten;
        this.id = id;
        this.tien = tien;
    }

    public sanpham(List<sanpham> sanphams) {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getTien() {
        return tien;
    }
    public void setTien(double tien) {
        this.tien = tien;
    }
    @Override
    public String toString() {
        return "sanpham{" +
                "ten='" + ten + '\'' +
                ", id=" + id +
                ", tien=" + tien +
                '}';
    }
//    public abstract void showInfo();
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || !(obj instanceof Person))
            return  false;

        Person otherPerson = (Person) obj;
        if(this.ten.equals(otherPerson.getName()))
        {
            return  true;
        }
        return  false;
    }
}
