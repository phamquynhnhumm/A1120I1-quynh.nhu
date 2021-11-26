package _bai3_mang_va_phuong_thuc_trongjava.thuc_hanh;

import java.util.Scanner;

public class chuong_trinh_chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        double C, F;
        Scanner son = new Scanner(System.in);
        do {
            System.out.println("Mời chọn menu:");
            System.out.println("1:Chuyển độ C sang độ F .");
            System.out.println("2:Chuyển độ F sang độ C .");
            System.out.println("3:Exit");
            int n = son.nextInt();
            switch (n) {
                case 1: {
                    Scanner scannerc = new Scanner(System.in);
                    System.out.println("Nhập vào độ C :");
                    C = scannerc.nextFloat();
                    System.out.println("Đổi sang độ f là ");
                    System.out.println(doisangF(C));
                    System.out.println("Nhấn 0 để tiếp tục");
                    break;
                }
                case 2: {
                    Scanner scannerf = new Scanner(System.in);
                    System.out.println("Nhập vào độ F :");
                    F = scannerf.nextFloat();
                    System.out.println("Đổi sang độ c là ");
                    System.out.println(doisangC(F));
                    System.out.println("Nhấn 0 để tiếp tục");
                    break;
                }
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Hãy chọn  1 trong 3 ");
            }
        } while ( son.nextInt() !=3);

    }

    public  static double doisangC(double F) {
        double doC = (5.0 / 9) * (F - 32);
        return doC;
    }

    public static double doisangF(double C) {
        double fahrenheit = (9.0 / 5) * C + 32;
        return fahrenheit;
    }
}
