package _bai1_introdution_java.thuc_hanh;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        int thang;
        Scanner nhapthang = new Scanner(System.in);
        System.out.println("Nhập vào  tháng bạn muốn kiểm tra :");
        thang = nhapthang.nextInt();
        switch (thang)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng" +thang+" có 31 ngày");
                break;
            case 2:
                System.out.printf("Tháng 2 có 28 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng "+thang+" có 30 ngày");
                break;
            default:
                System.out.println("không hợp lệ");
                break;
        }
    }
}
