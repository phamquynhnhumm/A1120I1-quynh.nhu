package _bai6_kethua.bai_tap;

import org.omg.CORBA.MARSHAL;

public class Cylinder extends Circle {
    public static void main(String[] args) {
   Cylinder cy1 = new Cylinder(5,"den",6);
        System.out.println(cy1);
    }
    public  int chieucao ;

    public Cylinder(double bk, String mau, int chieucao) {
        super(bk, mau);
        this.chieucao = chieucao;
    }

    public int getChieucao() {
        return chieucao;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }
    public  double thetich()
    {
        return   this.bk*this.bk *this.chieucao* Math.PI;
    }
    @Override
    public  String toString()
    {
        return " the tich la :" + thetich() +super.toString();
    }
}
