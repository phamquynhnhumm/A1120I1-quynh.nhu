package _bai12_Java_Collection_Framework._baitap;

import _bai12_Java_Collection_Framework.on_tap.PersonManaer;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        System.out.println("Danh sách sản phẩm là : ");
        sanpham sanpham1 = new sanpham("sữa tắm", 1, 5.76);
        sanpham sanpham2 = new sanpham("sữa rửa mặt", 2, 65.7);
        chucnangsp chucnangsp3 = new chucnangsp(new ArrayList<>());
        chucnangsp3.them(sanpham1);
        chucnangsp3.them(sanpham2);
        for (sanpham sanpham : chucnangsp3.getSanphams()) {
            System.out.println(sanpham);
        }
        System.out.println("\n \n -------MENU-------");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo id");
        System.out.println("3. xóa sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. sắp xếp sản phẩm theo giá:");
        System.out.println("7. Thoát khỏi chương trình");

        int so;
        boolean n = true;
        do {
            System.out.println("Nhập vào chức năng bạn muốn : ");
            Scanner sonhap = new Scanner(System.in);
            so = sonhap.nextInt();
            switch (so) {
                case 1:
                    int k;
                    Scanner nhapk = new Scanner(System.in);
                    System.out.println("Nhập vào số sản phẩm bạn muôn thêm :");
                    k = nhapk.nextInt();
                    int id;
                    double tien;
                    String ten;
                    for (int i = 0; i < k; i++) {
                        System.out.println("Sản phẩm thứ  :" + i);
                        Scanner nhapit = new Scanner(System.in);
                        System.out.println("id :");
                        id = nhapit.nextInt();

                        Scanner nhapten = new Scanner(System.in);
                        System.out.println("Tên :");
                        ten = nhapten.nextLine();

                        Scanner nhaptien = new Scanner(System.in);
                        System.out.println("Tiền :");
                        tien = nhaptien.nextFloat();

                        System.out.println("Danh sách sản phẩm sau khi được thêm là :");
                        sanpham sanpham = new sanpham(ten, id, tien);

                        chucnangsp3.them(sanpham);
                    }
                    for (sanpham sanpham : chucnangsp3.getSanphams()) {
                        System.out.println(sanpham);
                    }
                    n = false;
                    break;
                case 2:
                    int id1;
                    String ten2;
                    double tien2;
                    Scanner nhapid = new Scanner(System.in);
                    System.out.println("chọn id mà  sản phẩm bạn muốn sửa");
                    id1 = nhapid.nextInt();

                    Scanner nhapten = new Scanner(System.in);
                    System.out.println("Sửa tên thành :");
                    ten2 = nhapten.nextLine();

                    Scanner nhaptien = new Scanner(System.in);
                    System.out.println("Sửa tiền thành :");
                    tien2 = nhaptien.nextFloat();
                    sanpham sanphamk = new sanpham(ten2, id1, tien2);

                    for (sanpham sanpham : chucnangsp3.getSanphams()) {
                        if (sanpham.getId() == sanphamk.getId()) {
                            System.out.println("chỉnh sửa ");
                            //  chucnangsp3.xoa(sanpham);
                            System.out.println(sanphamk);
                        }
                    }
                    for (sanpham sanpham : chucnangsp3.getSanphams()) {
                        System.out.println(sanpham);
                    }

                    n = false;
                    break;
                case 3:
                    int id3;
                    System.out.println("Nhập vào id mà sản phẩm bạn muốn xóa khỏi danh sách :");
                    Scanner nhapid3 = new Scanner(System.in);
                    id3 = nhapid3.nextInt();

                    int tt = 0;
                    for (int i = 0; i < chucnangsp3.sanphams.size(); i++) {
                        sanpham sanpham = new sanpham(chucnangsp3.getSanphams());
                        {
                            //   System.out.println( "id là :"+);
                            System.out.println("id3 là :" + id3);
                            if (id3 == sanpham.getId()) {
                                chucnangsp3.xoa(tt);
                            }
                            ++tt;
                        }
                    }
                    System.out.println("Danh sách sản phẩm sau khi bạn đã xóa là :");
                    for (sanpham sanpham : chucnangsp3.getSanphams()) {
                        System.out.println(sanpham);
                    }
                    n = false;
                    break;
                case 4:
                    for (sanpham sanpham : chucnangsp3.getSanphams()) {
                        System.out.println(sanpham);
                    }
                    n = false;
                    break;
                case 5:
                    System.out.println("Nhập vào tên sản phẩm mà bạn muốn tìm kiếm :");
                    String ten5;
                    Scanner nhapten5 = new Scanner(System.in);
                    ten5 = nhapten5.nextLine();
                    System.out.println("Sản phẩm có tên là :" + ten5 + "  Có thông tin như sau :");
                    for (sanpham sanpham : chucnangsp3.getSanphams()) {
                        if (ten5.equals(sanpham.getTen())) {
                            System.out.println(sanpham);
                        }
                    }
                    n = false;
                    break;
                case 6:
                    System.out.println("bạn muốn sắp xếp theo tiền \n a :Giảm dần \n b : Tăng dần");

                    n = false;
                    break;
                case 7:
                    n = true;
                    break;
                default:
                    //    throw new IllegalStateException("Unexpected value: " + so);
            }
        } while (!n);
    }

}
