package _bai3_mang_va_phuong_thuc_trongjava.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String ten[] = {"nhu", "nga", "tram", "thuy", "xoan", "oanh"};
        String timten;
        int dem = 0;
        Scanner nhapten = new Scanner(System.in);
        System.out.println("Nhap vao ten sinh vien ban muon tim kiem :");
        timten = nhapten.nextLine();
        for (int i = 0; i < ten.length; i++) {
            if (ten[i].equals(timten)) {
                System.out.println("vi tru cua " + ten[i] + "la :" + i);
                dem++;
            }
        }
        if (dem <= 0) {
            System.out.println("khong tim thay ten sinh vien trong danh sach");
        }
    }
}
