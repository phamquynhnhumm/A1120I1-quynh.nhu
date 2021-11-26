package _bai3_mang_va_phuong_thuc_trongjava.bai_tap;

import java.util.Scanner;
import java.util.concurrent.locks.StampedLock;

public class tim_phan_tu_lon_nhat_trong_mang_2chieu {
    public static void main(String[] args) {
        int n, m;
        Scanner nhapn = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài mảng");
        n = nhapn.nextInt();

        Scanner nhapm = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng của mảng");
        m = nhapm.nextInt();


        Scanner pt = new Scanner(System.in);
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập hàng thứ " + i + ":");
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "]  = ");
                a[i][j] = pt.nextInt();
            }
        }
        System.out.println("phần tử lớn nhất trong mảng là :");
        int dong = 0;
        int hang =0;
        int ln = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > ln) {
                    ln = a[i][j];
                    dong = i;
                    hang = j;
                }
            }
        }
        System.out.print(ln + " ");
        System.out.println("vị trí hành :" + hang +"Cột :" +dong);
    }
}


