package _bai3_mang_va_phuong_thuc_trongjava.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner nhapso = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ":");
            a[i] = nhapso.nextInt();
        }
        System.out.println("Max :");
        sort(a);
    }

    public static void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
    }
}
