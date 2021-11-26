package _bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class thiet_ke_menu_cho_ung_dung {
    public static void main(String[] args) {
        int n = 0;
        Scanner so_n = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1: Vẽ hình tam giác");
        System.out.println("2: vẽ hình chữ nhật");
        System.out.println("3: vẽ hình vuông");
        System.out.println("0: Thoát");
        n = so_n.nextInt();
        if (n == 1) {
            System.out.println("  *  ");
            System.out.println(" *** ");
            System.out.println("");
        } else if (n == 2) {
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
        } else if (n == 3) {
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
        } else {
            System.exit(0);
        }


    }
}
