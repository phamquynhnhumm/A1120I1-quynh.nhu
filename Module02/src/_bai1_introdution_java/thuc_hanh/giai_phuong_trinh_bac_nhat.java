package _bai1_introdution_java.thuc_hanh;

import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc nhất có dạng ax+b = c");
        float a, b, c, kq;
        Scanner soa = new Scanner(System.in);
        System.out.println("Nhập vào a :");
        a = soa.nextFloat();
        Scanner sob = new Scanner(System.in);
        System.out.println("Nhập vào b:");
        b = sob.nextFloat();
        Scanner soc = new Scanner(System.in);
        System.out.println("Nhập vào c:");
        c = soc.nextFloat();
        if (a == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else {
            kq = (c - b) / a;
            System.out.println("Nghiệm của phương trình là  x = " + kq);
        }
    }
}
