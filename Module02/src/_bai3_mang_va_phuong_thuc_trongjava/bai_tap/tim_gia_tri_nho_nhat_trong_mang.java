package _bai3_mang_va_phuong_thuc_trongjava.bai_tap;

import java.util.Scanner;

public class tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int n;
        Scanner nhapn = new Scanner(System.in);
        System.out.print("Nhập số phần tử  mảng :");
        n = nhapn.nextInt();
        int[] a = new int[n];
        Scanner nhapso = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] =");
            a[i] = nhapso.nextInt();
        }
        System.out.print("\nmảng đó là :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }

        System.out.print("\ngiá trị nhỏ nhất trong mảng là :");
        System.out.print(a[a.length - 1] + " ");

    }
}
