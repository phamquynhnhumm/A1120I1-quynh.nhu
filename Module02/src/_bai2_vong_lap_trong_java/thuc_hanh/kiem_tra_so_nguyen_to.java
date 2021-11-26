package _bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        int so;
        int dem = 0;
        Scanner nhapso = new Scanner(System.in);
        System.out.println("Nhập vào số  :");
        so = nhapso.nextInt();
        if (so < 2) {
            System.out.println("" + so + "  Không phải là số nguyên tố");
        } else {
            for (int i = 2; i < so; i++) {
                if (so % i == 0)
                    dem++;
            }
            if(dem > 0)
            {
                System.out.println(""+so +" không là số nguyên tố");
            }
            else {
                System.out.println(""+so +"  là số nguyên tố");
            }
        }
    }
}

