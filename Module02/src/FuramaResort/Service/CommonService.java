//package FuramaResort.Service;
//
//import FuramaResort.Commons.File;
//import FuramaResort.Commons.ReadWriteFile;
//import FuramaResort.Commons.Validators;
//import FuramaResort.Models.House;
//import FuramaResort.Models.Services;
//import jdk.nashorn.internal.runtime.OptimisticReturnFilters;
//
//import java.util.Scanner;
//
//public class CommonService {
//    private static ReadWriteFile regex;
//
//    static {
//        regex = new ReadWriteFile();
//    }
//
//    public CommonService() {
//    }
//
//    public Services inputServices(String filleName) {
//            Scanner nhapid = new Scanner(System.in);
//            Scanner nhapten = new Scanner(System.in);
//            Scanner nhapdt = new Scanner(System.in);
//            Scanner nhapcp = new Scanner(System.in);
//            Scanner nhapsln = new Scanner(System.in);
//            Scanner nhapkt = new Scanner(System.in);
//            String ten;
//            System.out.println("Nhập id :");
//            int id = nhapid.nextInt();
//            do {
//                System.out.println("Tên dịch vụ ");
//                ten = nhapten.nextLine();
//            } while (!Validators.isValidService(ten, Validators.CODE));
//
//            double dienTich;
//
//            do {
//                System.out.print("Nhập diện tich :");
//                dienTich = nhapdt.nextDouble();
//
//            } while (!Validators.isDienTich(dienTich, 30));
//
//
//            double chiPhi;
//            do {
//                System.out.print("Nhập chi phí  :");
//                chiPhi = nhapcp.nextDouble();
//            } while (!Validators.isChiPhi(chiPhi, 0));
//
//            int soLuongNguoi;
//            do {
//                System.out.print("Nhập số lượng người :");
//                soLuongNguoi = nhapsln.nextInt();
//
//            } while (!Validators.isSoNguoi(soLuongNguoi, 0, 20));
//            String kieuThue;
//            do {
//                System.out.print("Nhập kiểu thuê :");
//                kieuThue = nhapkt.nextLine();
//            } while (!Validators.isValidService(kieuThue, Validators.CODE));
//
//           switch (filleName)
//           {
//               case  "house":
//                   return new House(ten,dienTich,chiPhi,soLuongNguoi,kieuThue)
//
//           }
//
//
//
//    }
//}
