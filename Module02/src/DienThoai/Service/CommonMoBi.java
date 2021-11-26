package DienThoai.Service;

import DienThoai.Commons.Regex;
import DienThoai.Model.Mobi;
import DienThoai.Model.MobiChinhHang;
import DienThoai.Model.MobiXachTay;

import java.util.Scanner;

public class CommonMoBi {
    private static Regex regex;

    static {
        regex = new Regex();
    }

    public Mobi inputMoBi(int typeMoBi) {
        String id;
        String tendt;
        String giaban;
        String soluong;
        String nhasanxuat;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào id :");
        id = sc.nextLine();
        System.out.print("Nhập vào tên điện thoại :");
        tendt = sc.nextLine();
        System.out.print("Nhập vào giá bán");
        giaban = sc.nextLine();
        System.out.print("Nhập vào số lượng :");
        soluong = sc.nextLine();
        System.out.println("Nhập vào nhà sản xuất");
        nhasanxuat = sc.nextLine();


        switch (typeMoBi) {
            case 1:
                return  new MobiChinhHang(id,tendt,giaban,soluong,nhasanxuat);
            case 2:
                return  new  MobiXachTay(id, tendt, giaban, soluong, nhasanxuat);
        }
        return null;
    }
}
