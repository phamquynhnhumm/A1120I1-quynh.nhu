package _bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        double tien,tile, thang, tienlai;
        Scanner sotien = new Scanner(System.in);
        System.out.println("Nhập vào số tiền cho vay");
        tien = sotien.nextFloat();

        Scanner tilelai =  new Scanner(System.in);
        System.out.println("Nhập vào tỉ lệ lãi suất theo tháng");
        tile = tilelai.nextFloat();

        Scanner  sothang = new Scanner(System.in);
        System.out.println("Nhập vào số tháng cho vay:");
        thang = sothang.nextFloat();

         tienlai = tien * tile/200/12 * thang;
        System.out.println("Số tiền lãi là :" + tienlai);
    }
}
