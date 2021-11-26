package _bai3_mang_va_phuong_thuc_trongjava.bai_tap;

import java.util.Scanner;

public class them_pt_vao_mang {
    public static void main(String[] args) {
        int n;
        Scanner nhapn = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử trong mảng :");
        n = nhapn.nextInt();
        int[] a = new int[n];

        Scanner nhapso = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] =");
            a[i] = nhapso.nextInt();
        }

        System.out.print("Mảng là :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int them, sothem;
        Scanner nhapthem = new Scanner(System.in);
        System.out.print("\nNhập vào vị trí bạn muốn thêm");
        them = nhapthem.nextInt();

        Scanner nhapsothem = new Scanner(System.in);
        System.out.print("Nhập vào số bạn muốn thêm");
        sothem = nhapsothem.nextInt();


        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }



        for (int j = b.length - 1; j > them; j--) {
            b[j] = b[j - 1];

        }
        b[them] = sothem;
        System.out.println("Mảng đã thêm là :");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}