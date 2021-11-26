package _bai3_mang_va_phuong_thuc_trongjava.bai_tap;

import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        int n, m;
        Scanner nhapn = new Scanner(System.in);
        System.out.print("Nhập vào phần tử trong mảng thứ nhất :");
        n = nhapn.nextInt();
        int[] a = new int[n];
        Scanner mang1 = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] =");
            a[i] = mang1.nextInt();
        }

        Scanner nhapm = new Scanner(System.in);
        System.out.print("Nhập vào phần tử trong mảng thứ hai :");
        m = nhapm.nextInt();
        int[] b = new int[m];
        Scanner mang2 = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] =");
            b[i] = mang2.nextInt();
        }

        System.out.print("Mảng 1 là :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nMảng 2 là :");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

         int [] c = new int[n+m];
        for( int i=0;i<a.length;i++) {
            c[i] = a[i];
        }

        for( int i=0;i<b.length;i++) {
            c[i+n] = b[i];
        }
        System.out.println("Mảng gộp là :");
        for( int i=0;i<c.length;i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}
