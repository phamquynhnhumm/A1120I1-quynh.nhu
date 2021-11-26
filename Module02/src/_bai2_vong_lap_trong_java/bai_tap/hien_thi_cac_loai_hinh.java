package _bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int so;
        System.out.println("1.hình chữ nhật");
        System.out.println("2.hình tam giác vuông");
        System.out.println("3.hình tam giác cân");
        System.out.println("0. thoat");
        Scanner nhapso = new Scanner(System.in);
        so = nhapso.nextInt();
        while (so < 0 || so > 3) {
            System.out.println("Nhập vào  lựa chọn:");
            so = nhapso.nextInt();

        }
        if (so == 1) {
            for (int i = 1; i <= 4; i++) {
                System.out.println(" ");
                for (int j = 0; j <= 20; j++) {
                    System.out.print("*");
                }
            }
        } else if (so == 2) {
            for (int i = 1; i <= 6; i++) {
                System.out.println(" ");
                for (int j = i; j <= 6; j++) {
                    System.out.print("*");
                }
            }
        } else if (so == 3) {
            for (int r = 1; r <= 6; r++) {
                for (int sp = 6 - r; sp > 0; sp--) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= r; c++) {
                    System.out.print("*");
                }
                for (int k = 2; k <= r; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.exit(0);
        }


    }
}
