package FuramaResort.Controllers;

import FuramaResort.Commons.File;
import FuramaResort.Commons.StingUtilss;
import FuramaResort.Commons.Validators;
import FuramaResort.Models.*;
import FuramaResort.exception.GenderException;
import FuramaResort.exception.NameException;

import java.net.BindException;
import java.util.*;

public class MainController {
    private List<Services> serList;
    public static void displayMainMenu() {
        int menus = 0;
        boolean isexit = true;
        do {
            System.out.println("-------------------------1");
            System.out.println("Menu :\n" +
                    "1. Thêm dịch vụ mới\n" +
                    "2. Hiển thị dịch vụ\n" +
                    "3. Thêm khách hàng mới\n" +
                    "4. Hiển thị thông tin của khách hàng\n" +
                    "5. Đặt phòng mới\n" +
                    "6. Hiển thị thông tin của nhân viên\n" +
                    "7. Thoát\n ");

            Scanner chonMenu = new Scanner(System.in);
            //  Xử lý lỗi nhập chữ
            try {
                System.out.print("Nhập vào lựa chọn của bạn :");
                menus = chonMenu.nextInt();
                boolean checkInput = true;
            } catch (Exception e) {
                boolean checkInput = false;
                chonMenu.nextLine();
            }

            switch (menus) {
                case 1:
                    addNewServies();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer("customer");
                    System.out.println("xin chao3");
                    break;
                case 4:
                    showKhachHang("customer");
                    System.out.println("xin chao4");
                    break;
                case 5:
                    System.out.println("xin chao5");
                    break;
                case 6:
                    showNhanVien();
                    System.out.println("xin chao6");
                    break;
                case 7:
                    isexit = false;
                    break;
                default:
                    System.out.println("Bạn  vi lòng chọn các mục  có trong Menu : 1-7");
            }
            System.out.println("Nhập 0 để tiếp tục chương trình  và nhập 1 nếu bạn muốn thoát khỏi chương trình");
            Scanner nhapx = new Scanner(System.in);
            int x = nhapx.nextInt();
            if (x == 0) {
                menus = 10;
            } else if (x == 1) {
                menus = 7;
            }
            if (isexit = false)
                break;


        } while (menus < 1 || menus > 8);


    }

    public static void addNewServies() {
        int menu = 0;
        boolean isexits = true;
        do {
            System.out.println("-------------------------2");
            System.out.println(" THÊM DỊCH VỤ MỚI:\n" +
                    "1. Thêm Villa mới\n" +
                    "2. Thêm House mới\n" +
                    "3. Thêm Room mới\n" +
                    "4. Thoát\n" +
                    "5. Quay lại menu ban đầu");
            Scanner chonMenus = new Scanner(System.in);
            //  Xử lý lỗi nhập chữ
            try {
                System.out.print("Nhập vào lựa chọn của dịch vụ  bạn muốn thêm :");
                menu = chonMenus.nextInt();
                boolean checkInput = true;
            } catch (Exception e) {
                boolean checkInput = false;
                chonMenus.nextLine();
            }
            switch (menu) {
                case 1:
                    addNewServie("villa");
                    System.out.println("Đã thêm xong villa");
                    break;
                case 2:
                    addNewServie("house");
                    System.out.println("Đã thêm xong house");
                    break;
                case 3:
                    addNewServie("room");
                    System.out.println("Đã thêm xong room");
                    break;
                case 4:
                    isexits = false;
                    break;
                case 5:
                    System.out.println("Quay lại menu:");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Bạn vui lòng chọn dịch vụ muốn thêm từ 1->4 \n Nếu muốn thoát khỏi chương trình bạn hãy chọn 5!");

            }
            System.out.println("Nhập 0 để tiếp tục chương trình  và nhập 1 nếu bạn muốn thoát khỏi chương trình");
            Scanner nhapx = new Scanner(System.in);
            int x = nhapx.nextInt();
            if (x == 0) {
                menu = 10;
            } else if (x == 1) {
                menu = 4;
            }
            if (isexits == false)
                break;

        } while (menu < 1 || menu > 5);

    }

    private static void showServices() {
        int menu2 = 0;
        boolean isexits = true;
        do {
            System.out.println("------------------3");
            System.out.println("HIỂN THỊ DỊCH VỤ ");
            System.out.println("1. Hiển thị tất cả Villa\n" +
                    "2. Hiển thị tất cả House \n" +
                    "3. Hiển thị tất cả Room\n" +
                    "4. Hiển thị tất cả Villa tên không trùng nhau\n" +
                    "5. Hiển thị tất cả House tên không trùng nhau\n" +
                    "6. Hiển thị tất cả Room tên không trùng nhau\n" +
                    "7. Quay lại Menu\n" +
                    "8. Thoát\n");
            Scanner chonMenus = new Scanner(System.in);
            //  Xử lý lỗi nhập chữ
            try {
                System.out.print("Nhập vào lựa chọn của dịch vụ  bạn muốn thêm :");
                menu2 = chonMenus.nextInt();
                boolean checkInput = true;
            } catch (Exception e) {
                boolean checkInput = false;
                chonMenus.nextLine();
            }
            switch (menu2) {
                case 1:
                    showServie("villa");
                    break;
                case 2:
                    showServie("house");
                    break;
                case 3:
                    showServie("room");
                    break;
                case 4:
                    showServieNotName("villa");
                    break;
                case 5:
                    showServieNotName("house");
                    break;
                case 6:
                    showServieNotName("room");
                    break;
                case 7:
                    System.out.println("Quay lại menu:");
                    displayMainMenu();
                    break;
                case 8:
                    isexits = false;
                    break;
                default:
                    System.out.println("Bạn vui lòng chọn dịch vụ muốn thêm từ 1->4 \n Nếu muốn thoát khỏi chương trình bạn hãy chọn 5!");
            }
            System.out.println("Nhập 0 để tiếp tục chương trình  và nhập 1 nếu bạn muốn thoát khỏi chương trình");
            Scanner nhapx = new Scanner(System.in);
            int x = nhapx.nextInt();
            if (x == 0) {
                menu2 = 10;
            } else if (x == 1) {
                menu2 = 8;
            }
            if (isexits == false)
                break;
        } while (menu2 < 1 || menu2 > 9);
    }


    public static void addNewServie(String filleName) {
        Scanner nhapid = new Scanner(System.in);
        Scanner nhapten = new Scanner(System.in);
        Scanner nhapdt = new Scanner(System.in);
        Scanner nhapcp = new Scanner(System.in);
        Scanner nhapsln = new Scanner(System.in);
        Scanner nhapkt = new Scanner(System.in);
        String ten;
        System.out.println("Nhập id :");
        int id = nhapid.nextInt();
        do {
            System.out.println("Tên dịch vụ ");
            ten = nhapten.nextLine();
        } while (!Validators.isValidService(ten, Validators.CODE));

        double dienTich;

        do {
            System.out.print("Nhập diện tich :");
            dienTich = nhapdt.nextDouble();

        } while (!Validators.isDienTich(dienTich, 30));


        double chiPhi;
        do {
            System.out.print("Nhập chi phí  :");
            chiPhi = nhapcp.nextDouble();
        } while (!Validators.isChiPhi(chiPhi, 0));

        int soLuongNguoi;
        do {
            System.out.print("Nhập số lượng người :");
            soLuongNguoi = nhapsln.nextInt();

        } while (!Validators.isSoNguoi(soLuongNguoi, 0, 20));
        String kieuThue;
        do {
            System.out.print("Nhập kiểu thuê :");
            kieuThue = nhapkt.nextLine();
        } while (!Validators.isValidService(kieuThue, Validators.CODE));


        File.setFullPathFile(filleName);


        if (filleName.equals("villa")) {
            Scanner nhaptcp = new Scanner(System.in);
            Scanner nhapmttnk = new Scanner(System.in);
            Scanner nhapdthb = new Scanner(System.in);
            Scanner nhapst = new Scanner(System.in);

            String tieuChuanPhong;
            do {
                System.out.print("Nhập tiêu chuẩn phòng :");
                tieuChuanPhong = nhaptcp.nextLine();
            } while (!Validators.isValidService(tieuChuanPhong, Validators.CODE));

            System.out.print("Nhập Mô tả tiện nghi khác :");
            String moTaTienNghiKhac = nhapmttnk.nextLine();
            double dienTichhoBoi;
            do {
                System.out.print("Nhập diện tích hồ bơi :");
                dienTichhoBoi = nhapdthb.nextDouble();
            } while (!Validators.isDienTich(dienTichhoBoi, 30));
            int soTang;
            do {
                System.out.print("Nhập số tầng:");
                soTang = nhapst.nextInt();
            } while (!Validators.isTang(soTang, 0));

            File.writeFile(new String[]{String.valueOf(id), ten, String.valueOf(dienTich), String.valueOf(chiPhi),
                    String.valueOf(soLuongNguoi), kieuThue, tieuChuanPhong, moTaTienNghiKhac, String.valueOf(dienTichhoBoi), String.valueOf(soTang)},true);
            System.out.println("đọc ra");

            System.out.println(File.readFile());
        } else if (filleName.equals("house")) {
            Scanner nhaptcp = new Scanner(System.in);
            Scanner nhapmttnk = new Scanner(System.in);
            Scanner nhapst = new Scanner(System.in);
            String tieuChuanPhong;
            do {
                System.out.print("Nhập tiêu chuẩn phòng :");
                tieuChuanPhong = nhaptcp.nextLine();
            } while (!Validators.isValidService(tieuChuanPhong, Validators.CODE));

            System.out.print("Nhập mô tả tiện nghi khác :");
            String moTaTienNghiKhac = nhapmttnk.nextLine();
            System.out.print("Nhập số tầng :");
            int soTang = nhapst.nextInt();
            File.writeFile(new String[]{String.valueOf(id), ten, String.valueOf(dienTich), String.valueOf(chiPhi),
                    String.valueOf(soLuongNguoi), kieuThue, tieuChuanPhong, moTaTienNghiKhac, String.valueOf(soTang)},true);

            System.out.println("đọc ra");

            System.out.println(File.readFile());
        } else if (filleName.equals("room")) {
            Scanner nhapdvf = new Scanner(System.in);
            Scanner nhapdv = new Scanner(System.in);
            Scanner nhapgt = new Scanner(System.in);
            String dichVuFree;
            do {
                System.out.print("Nhập  tên dịch vụ free :");
                dichVuFree = nhapdvf.nextLine();

            } while (!Validators.isDichVu(dichVuFree, Validators.DICVU));

            System.out.print("Nhập đơn vị :");
            String donVi = nhapdv.nextLine();
            System.out.print("Nhập giá tiền :");
            double giaTien = nhapgt.nextDouble();

            File.writeFile(new String[]{String.valueOf(id), ten, String.valueOf(dienTich), String.valueOf(chiPhi),
                    String.valueOf(soLuongNguoi), kieuThue, dichVuFree, donVi, String.valueOf(giaTien)},true);

            System.out.println(File.readFile());
        }
    }


    public static List<Services> readdServices(String filename) {
        File.setFullPathFile(filename);
        List<String> proper = File.readFile();
        List<Services> listOfservices = new ArrayList<>();
        String[] propertiesElement = null;
        Services services = null;
        Dichvudikem dichvudikem = null;
        for (String properties : proper) {
            propertiesElement = properties.split(StingUtilss.COMMA);
            if (filename.equals("villa")) {
                services = new Villa();
                ((Villa) services).setTieuChuanPhong(propertiesElement[6]);
                ((Villa) services).setMoTaTienNghiKhac(propertiesElement[7]);
                ((Villa) services).setDienTichHoBoi(Double.parseDouble(propertiesElement[8]));
                ((Villa) services).setSoTang(Integer.parseInt(propertiesElement[9]));
            } else if (filename.equals("house")) {
                services = new House();
                ((House) services).setTieuChuan(propertiesElement[6]);
                ((House) services).setMoTaTienNghiKhac(propertiesElement[7]);
              //  ((House) services).setSoTang(Integer.parseInt(propertiesElement[8]));
            } else if (filename.equals("room")) {

                dichvudikem = new Dichvudikem(propertiesElement[6], propertiesElement[7], Double.parseDouble(propertiesElement[8]));
                services = new Room();
                ((Room) services).setDichvudikem(dichvudikem);
            }
            services.setId(Integer.parseInt(propertiesElement[0]));
            services.setTen(propertiesElement[1]);
            services.setDienTich(Double.parseDouble(propertiesElement[2]));
            services.setChiPhi(Double.parseDouble(propertiesElement[3]));
            services.setSoLuongNguoi(Integer.parseInt(propertiesElement[4]));
            services.setKieuThue(propertiesElement[5]);
            listOfservices.add(services);
        }
        return listOfservices;
    }

    private static void showServie(String name) {
        List<Services> list = readdServices(name);
        Collections.sort(list);
        for (Services customer : list) {
            customer.showInfor();
        }

    }

    private static void showServieNotName(String fillename) {
        Set<String> set = new TreeSet<>();
        System.out.println("Tên Servires không trung ten");
        for (Services services : readdServices(fillename)) {
            set.add(services.getTen());
        }
        for (String name : set) {
            System.out.println(name);
        }

    }

    private static void addNewCustomer(String name) {
        Scanner nhapt = new Scanner(System.in);
        Scanner nhapns = new Scanner(System.in);
        Scanner nhapgt = new Scanner(System.in);
        Scanner nhapcmnd = new Scanner(System.in);
        Scanner nhapsdt = new Scanner(System.in);
        Scanner nhapemail = new Scanner(System.in);
        Scanner nhaplk = new Scanner(System.in);
        Scanner nhapdc = new Scanner(System.in);
        String ten;
        boolean flag = true;
        do {
            flag = true;
            System.out.print("Nhập tên khách hàng :");
            ten = nhapt.nextLine();
            try {
                Validators.isTenKh(ten);
            } catch (NameException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);
        String ngaysinh;
        do {
            System.out.print("Nhập ngày sinh khách hàng :");
            ngaysinh = nhapns.nextLine();

            try {
                Validators.isNgaySinh(ngaysinh);
            } catch (BindException e) {
                e.printStackTrace();
            }

        } while (!flag);

        String gioitinh;
        do {
            flag = true;
            System.out.print("Nhập giới tính khách hàng :");
            gioitinh = nhapgt.nextLine();
            try {
                Validators.isGioiTinh(gioitinh);
            } catch (GenderException e) {
                flag = false;
                e.printStackTrace();
            }

        } while (!flag);

        String cmnd;
        do {
            System.out.print("Nhập số cmnd khách hàng :");
            cmnd = nhapcmnd.nextLine();

        } while (!Validators.isIDKHACH(cmnd, Validators.IDKHACH));

        System.out.print("Nhập số điện thoại khách hàng :");
        String sodt = nhapsdt.nextLine();
        String email;
        do {
            System.out.print("Nhập email khách hàng :");
            email = nhapemail.nextLine();
        } while (!Validators.isEMAIL(email, Validators.EMAIL_REGEX));

        System.out.print("Nhập loại  khách hàng :");
        String loaikhach = nhaplk.nextLine();
        System.out.print("Nhập  địa chỉ khách hàng :");
        String diachi = nhapdc.nextLine();

        File.setFullPathFile("customer");
        File.writeFile(new String[]{ten, ngaysinh, gioitinh, cmnd, sodt, email, loaikhach, diachi},true);
        System.out.println(File.readFile());
    }

    public static List<Customer> readdKhachHang(String filename) {
        File.setFullPathFile(filename);
        List<String> proper = File.readFile();
        List<Customer> listOfcustomer = new ArrayList<>();
        String[] propertiesElement = null;
        Customer customer = null;
        for (String properties : proper) {
            propertiesElement = properties.split(StingUtilss.COMMA);
            customer = new Customer();
            customer.setHoTenKhach(propertiesElement[0]);
            customer.setNgaySinh(propertiesElement[1]);
            customer.setGioiTinh(propertiesElement[2]);
            customer.setSoCMND(propertiesElement[3]);
            customer.setSoDT(propertiesElement[4]);
            customer.setEmail(propertiesElement[5]);
            customer.setLoaiKhach(propertiesElement[6]);
            customer.setDiaChi(propertiesElement[7]);

            listOfcustomer.add(customer);
        }
        return listOfcustomer;

    }

    private static void showKhachHang(String name) {
        List<Customer> list = readdKhachHang(name);
        Collections.sort(list);
        for (Customer customer : list) {
            customer.showInfor();
        }
    }

    private static Map<String, Employee> readAllNhanVien(String filename) {
        File.setFullPathFile(filename);
        List<String> pro = File.readFile();
        Map<String, Employee> map = new HashMap<>();
        String[] arr = null;
        Employee employee = null;
        for (String pr : pro) {
            arr = pr.split(StingUtilss.COMMA);
            employee = new Employee();
            employee.setId(arr[0]);
            employee.setFullName(arr[1]);
            employee.setDataNgaySinh(arr[2]);
            employee.setAddress(arr[3]);
            map.put(employee.getId(), employee);
        }

        return map;
    }
    private static  void  showNhanVien()
    {
        Map<String, Employee> map = readAllNhanVien("khachhang");
     for(Map.Entry<String,Employee> employeeEntry : map.entrySet())
     {
         System.out.println(employeeEntry.getKey() + " " +employeeEntry.getValue().toString() );
     }
    }

//    private static void showKhachHang(String name) {
//
//        for (Customer customer : readdKhachHang(name)) {
//            customer.showInfor();
//        }
//    }

    private static void showKhachHangNotName(String fillename) {
        Set<String> set = new TreeSet<>();
        System.out.println("Tên khách hàng không trung ten");
        for (Customer customer : readdKhachHang(fillename)) {
            set.add(customer.getHoTenKhach());
        }
        for (String name : set) {
            System.out.println(name);
        }

    }
//    public void deleteNhapKhau(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("NHAP Ma san pham can xoa");
//        String Ten = sc.nextLine();
//        for(int i =0;i<serList.size();i++){
//            if(serList.get(i).getTen().equals(Ten)){
//                System.out.println("Co san pham");
//                System.out.println("yes or no");
//                String option = sc.nextLine();
//                if(option.equals("yes")){
//                    serList.remove(i);
//                    updateData();
//                    view();
//                }
//            }
//        }
//    }
//    public void updateData(){
//        String data ="";
//        for(int i = 0;i<  serList.size();i++){
//            serList.get(i).setTen((i+1)+"");
//            data+=  serList.get(i).toString()+"\n";
//        }
//        File.writeFile(new String[]{ten, ngaysinh, gioitinh, cmnd, sodt, email, loaikhach, diachi},false);
//
//    }

//    private static void search(){
//        System.out.println(
//                "1. tim san pham nhap khau\n" +
//                        "2. tim san xuat khau\n" );
//        Scanner sc = new Scanner(System.in);
//        int choice = Integer.parseInt(sc.nextLine());
//        switch(choice){
//            case 1:
//                nhapKhauService.searchNhapKhau();
//                break;
//            case 2:
//                xuatKhauService.deleteXuatKhau();
//        }
//    }


    public static void main(String[] args) {
        displayMainMenu();
    }
}
