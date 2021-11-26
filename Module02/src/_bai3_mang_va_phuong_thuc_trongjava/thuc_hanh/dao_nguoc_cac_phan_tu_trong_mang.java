package _bai3_mang_va_phuong_thuc_trongjava.thuc_hanh;

import java.util.Scanner;

public class dao_nguoc_cac_phan_tu_trong_mang {
    public static void main(String[] args) {
        int n;
        Scanner nhapn = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử trong mảng: ");
        n = nhapn.nextInt();
        Scanner nhapso = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = nhapso.nextInt();

        }
        System.out.print("Mảng ban đầu là :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }

        for (int i = 0; i < a.length / 2; i++) {
            int tam = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tam;
        }
        System.out.print("\nMảng  sau khi đã đảo ngược ban là :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}