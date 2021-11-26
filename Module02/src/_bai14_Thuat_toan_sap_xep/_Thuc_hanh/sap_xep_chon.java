package _bai14_Thuat_toan_sap_xep._Thuc_hanh;

import java.util.Scanner;

public class sap_xep_chon {
    public static void main(String[] args) {
        int n;
        Scanner nhapn = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử trong mảng :");
        n = nhapn.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("phần tử thứ " + i + " :");
            Scanner nhapi = new Scanner(System.in);

            list[i] = nhapi.nextInt();
        }

        System.out.print("Các phần tử bn vừa nhập là :");

        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\nMảng đã được sắp xếp là");
        selectionSort(list);
    }

    public static void selectionSort(int [] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}

