package DienThoai.Controller;

import DienThoai.Service.ChinhHangMobi;
import DienThoai.Service.XachTayMobi;

import java.util.Scanner;

public class MainController {

    private static ChinhHangMobi chinhHangMobi;
    private static XachTayMobi xachTayMoBi;

    static {
        chinhHangMobi = new ChinhHangMobi();
        xachTayMoBi = new XachTayMobi();

    }

    public static void main(String[] args) {
        displayMenu();
    }

    private static void addNew(){
        System.out.println(
                "1. Them  điện thoại chính hãng\n" +
                        "2. them điện thoại xách tay\n" );
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice){
            case 1:
                chinhHangMobi.inputNewChinhHang();
                break;
            case 2:
                xachTayMoBi.inputNewXachTay();
        }
    }

    private static void delete() {
        System.out.println(
                "1. xóa điện thoại chính hãng\n" +
                        "2. xóa điện thoại xách tay\n");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                chinhHangMobi.deleteNhapKhau();
                break;
            case 2:
                xachTayMoBi.deletexachtay();
        }
    }

    private static void search() {
        System.out.println(
                "1. tim san pham nhap khau\n" +
                        "2. tim san xuat khau\n");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                chinhHangMobi.searchdt();
                break;
            case 2:
                xachTayMoBi.searchdt();
        }
    }

    private static void view() {
        System.out.println(
                "1. xem danh sách điện thoại chính hãng \n" +
                        "2. xem danh sách điện thoại xách tay\n");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                chinhHangMobi.view();
                break;
            case 2:
                xachTayMoBi.view();
        }
    }


//    }

    private static void displayMenu() {

        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--\n" +
                "Chọn các chức năng theo số :\n" +
                "1. Thêm mới\n" +
                "2. Xóa\n" +
                "3. Xem danh sách điện thoại\n" +
                "4. Tìm kiếm\n" +
                "5. Thoát\n" +
                "Chọn chức năng :"
        );
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                addNew();
                displayMenu();
                break;
            case 2:
                delete();
                displayMenu();
                break;
            case 3:
                view();
                break;
            case 4:
                search();
                displayMenu();

                break;
            case 5:
                break;
        }

    }
}
