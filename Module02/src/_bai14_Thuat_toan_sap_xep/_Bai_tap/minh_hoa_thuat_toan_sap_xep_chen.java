package _bai14_Thuat_toan_sap_xep._Bai_tap;

import java.util.Scanner;

public class minh_hoa_thuat_toan_sap_xep_chen {
    public static void main(String[] args) {
        int n;
        Scanner nhapn = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử trong mảng :");
        n = nhapn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("phần tử thứ " + i +" :");
            Scanner nhapi = new Scanner(System.in);
            arr[i] = nhapi.nextInt();
        }
        System.out.print("Các phần tử bn vừa nhập là :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Mảng đã được sắp xếp là");
        InsertionSort(arr);
    }
    public  static  void InsertionSort( int [] arr)
    {
        for( int i = 1;  i < arr.length; i ++)
        {
            int  currenElement = arr[i];
            int k ;
             for( k = i-1; k >=0 && arr[k] >currenElement ;k  --)
             {
                 arr[k+1] = arr[k];
             }
             arr[k+1] = currenElement;
        }
        for( int i =  0 ; i < arr.length; i ++)
        {
            System.out.println(arr[i]);
        }
    }
}
