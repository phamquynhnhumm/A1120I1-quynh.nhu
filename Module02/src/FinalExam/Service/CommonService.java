package FinalExam.Service;

import FinalExam.Commons.Regex;
import FinalExam.Model.SPNhapKhau;
import FinalExam.Model.SPXuatKhau;
import FinalExam.Model.SanPham;

import java.util.Scanner;

public class CommonService {
    private static Regex regex;
    static{
        regex = new Regex();
    }
    public SanPham inputSanPham(int typeSanPham){
        String id;
        String masp;
        String ten;
        String giaban;
        String soluong;
        String nhasanxuat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id san pham");
        id = sc.nextLine();
        System.out.println("Nhap masp");
        masp = sc.nextLine();
        System.out.println("Nhap ten");
        ten = sc.nextLine();

        System.out.println("Nhap gia ban");
        giaban = sc.nextLine();
        while(!regex.validateNumber(giaban)){
            System.out.println("Please, Try again!");
            giaban =  (sc.nextLine());
        };
        System.out.println("nhap soluong");
        soluong = sc.nextLine();

        while(!regex.validateNumber(soluong)){
            System.out.println("Please, Try again!");
            soluong =  (sc.nextLine());
        };
        System.out.println("Nhap nha san xuat");
        nhasanxuat = sc.nextLine();
        switch (typeSanPham){
            case 1:
                return new SPNhapKhau(id,masp,ten,giaban,soluong,nhasanxuat);
            case 2:
                return new SPXuatKhau(id,masp,ten,giaban,soluong,nhasanxuat);
        }
        return null;
    };



}
