package _bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int so, a = 0;
        Scanner nhapso = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất  :");
        so = nhapso.nextInt();

        int so2;
        Scanner nhapso2 = new Scanner(System.in);
        System.out.println("Nhập vào số thứ 2 :");
        so2 = nhapso2.nextInt();
        for (int i = so - 1; i > 0; i--) {
            if (so % i == 0 && so2 % i == 0) {
                a = i;
                break;
            }
        }
        System.out.println("ước chung cua" + so + "  và " + so2 + "là " + a);
    }
}
