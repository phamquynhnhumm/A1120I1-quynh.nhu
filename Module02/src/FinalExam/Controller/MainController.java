package FinalExam.Controller;

import FinalExam.Service.NhapKhauService;
import FinalExam.Service.XuatKhauService;

import java.util.Scanner;

public class MainController {
    private static NhapKhauService nhapKhauService;
    private static XuatKhauService xuatKhauService;
    static{
        nhapKhauService = new NhapKhauService();
        xuatKhauService = new XuatKhauService();

    }
    public static void main(String[] args) {
        displayMenu();
    }
    private static void addNew(){
        System.out.println(
                "1. Them san pham nhap khau\n" +
                        "2. them san xuat khau\n" );
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice){
            case 1:
                nhapKhauService.inputNewNhapKhau();
                break;
            case 2:
                xuatKhauService.inputNewXuatKhau();
        }
    }

    private static void delete(){
        System.out.println(
                "1. xoa san pham nhap khau\n" +
                        "2. xoasan xuat khau\n" );
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice){
            case 1:
                nhapKhauService.deleteNhapKhau();
                break;
            case 2:
                xuatKhauService.deleteXuatKhau();
        }
    }
    private static void search(){
        System.out.println(
                "1. tim san pham nhap khau\n" +
                        "2. tim san xuat khau\n" );
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice){
            case 1:
                nhapKhauService.searchNhapKhau();
                break;
            case 2:
                xuatKhauService.deleteXuatKhau();
        }
    }
    private static void view(){
        System.out.println(
                "1. tim san pham nhap khau\n" +
                        "2. tim san xuat khau\n" );
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice){
            case 1:
                nhapKhauService.view();
                break;
            case 2:
                xuatKhauService.view();
        }
    }
    private static void displayMenu()  {

        System.out.println(
                "!-----------MENU----------!\n"+
                        "1. Th??m m???i\n" +
                        "2. X??a\n" +
                        "3. Xem danh s??ch s???n ph???m\n" +
                        "4. T??m ki???m\n" +
                        "5. Tho??t\n" );

        Scanner sc = new Scanner(System.in);
        int choice =Integer.parseInt(sc.nextLine());
        switch (choice){
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
//                addNewBooking();

                break;


        }

    }
}
