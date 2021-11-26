package _bai4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class Xd_lop_QuadraticEquation {
    public static void main(String[] args) {
         double a,b,c;
        Scanner nhapa=  new  Scanner(System.in);
        System.out.println("Nhập vào a :");
        a = nhapa.nextFloat();

        Scanner nhapb  = new Scanner(System.in);
        System.out.println("Nhập vào b :");
        b = nhapb.nextFloat();

        Scanner nhapc = new Scanner(System.in);
        System.out.println("Nhập vào c :");
        c = nhapc.nextFloat();

        Xd_lop_QuadraticEquation ptbachai = new Xd_lop_QuadraticEquation(a,b,c);
        System.out.println("Nghiệm của phương trình bậc hai là : ");
        System.out.println("x1:" + ptbachai.getRoot1());

        System.out.println("Nghiệm của phương trình bậc hai là : ");
        System.out.println("x1:" + ptbachai.getRoot2());
}

    public   double a;
    public  double b;
    public  double  c;
    public   Xd_lop_QuadraticEquation (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  double getDiscriminant()
    {
        return b * b - 4 * a * c;
    }
    public  double getRoot1() {
        this.getDiscriminant();
         return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public  double getRoot2() {
        this.getDiscriminant();
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
