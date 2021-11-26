package _bai14_Thuat_toan_sap_xep._Thuc_hanh;

import java.util.Scanner;

public class sap_xep_noi_bot {
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
        bubleSortByStep(arr);
    }

    public static void bubleSortByStep(int[] arr) {
        boolean needNextPass = true;
        for (int k = 1; k < arr.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Swap" + arr[i] + "Whit" + arr[i + 1]);
                    int tam = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tam;
                    needNextPass = true;
                }
            }
            if( needNextPass == false)
            {
                System.out.println("Mảng đã được sắp xếp");
                break;
            }
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }

    }
}
