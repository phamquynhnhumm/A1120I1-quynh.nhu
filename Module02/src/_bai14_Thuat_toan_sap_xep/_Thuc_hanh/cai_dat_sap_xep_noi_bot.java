package _bai14_Thuat_toan_sap_xep._Thuc_hanh;

import java.util.Scanner;

public class cai_dat_sap_xep_noi_bot {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }
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
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

