package _bai1_introdution_java.bai_tap;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        String ten ;
        Scanner tenban = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn :");
        ten = tenban.nextLine();
        System.out.println("Xin chào  :" + ten);
    }
}
