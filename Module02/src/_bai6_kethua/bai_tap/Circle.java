package _bai6_kethua.bai_tap;

import sun.security.mscapi.CPublicKey;

public class Circle {
    public static void main(String[] args) {
        Circle  cr1 = new Circle(1,"xnah xnah");
        System.out.println(cr1);
    }

    public double bk;
    public String mau;

    public Circle(double bk, String mau) {
        this.bk = bk;
        this.mau = mau;
    }

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    public  double dienttich()
    {
        return  this.bk * this.bk *Math.PI;
    }
    public  double chuvi()
    {
        return  2* this.bk *Math.PI;
    }

    @Override
    public String toString()
    {
        return  "Chu vi la :" + this.chuvi() +"dien tich :" + this.dienttich() ;
    }
}
