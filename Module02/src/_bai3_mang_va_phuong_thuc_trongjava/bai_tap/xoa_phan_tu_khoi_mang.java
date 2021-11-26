package _bai3_mang_va_phuong_thuc_trongjava.bai_tap;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int n;
        Scanner nhapn = new Scanner(System.in);
        System.out.println("Hãy nhập vào sô phần tử trong mang : ");
        n = nhapn.nextInt();

        Scanner nhapso= new Scanner(System.in);
        int [] a = new  int[n];
        for( int i = 0 ; i <n;i++)
        {
            System.out.print("a[" + i+ "] =");
            a[i] = nhapso.nextInt();
        }
        System.out.print("Mảng đó là :");
        for (int  i=0;i< a.length;i ++)
        {
            System.out.print(a[i] +" ");
        }
        int soxoa ;
        System.out.println("Nhập vào số bạn muốn xóa khỏi mảng :");
        Scanner nhapsoxoa = new Scanner(System.in);
        soxoa = nhapsoxoa.nextInt();
        for( int i =0;i < a.length;i++)
        {
            if( soxoa == a[i])
            {
                for( int j =i ;j < a.length-1;j++)
                {
                    a[j] = a[j+1];
                }

            }
        }
        System.out.println("Mảng đã được xóa là  :");

        for( int i =0;i < a.length-1;i++)
        {
            System.out.println(a[i]);
        }


    }
}
