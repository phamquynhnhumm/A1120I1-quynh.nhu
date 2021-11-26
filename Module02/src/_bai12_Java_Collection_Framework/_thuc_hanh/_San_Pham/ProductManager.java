package _bai12_Java_Collection_Framework._thuc_hanh._San_Pham;


import _bai12_Java_Collection_Framework._thuc_hanh.Student;

import java.util.*;

public class ProductManager implements Comparator<Sap_Pham> {

    @Override
    public int compare(Sap_Pham o1, Sap_Pham o2) {
        if (o1.getGia() > o2.getGia()) {
            return 1;
        } else if (o1.getGia() == o2.getGia()) {
            return 0;
        } else return -1;
    }

    public static void main(String[] args) {


        System.out.println("Menu:");
        System.out.println("1.Thêm sản phẩm .");
        System.out.println("2.sửa thông tin sản phẩm theo id .");
        System.out.println("3: xóa sản phẩm theo id .");
        System.out.println("4: hiển thị danh sách sản phẩm .");
        System.out.println("5: Tìm kiếm sản phẩm theo tên .");
        System.out.println("6 : Sắp xếp sảm phẩm theo giá tăng dần .");
        System.out.println("7:Sắp xếp sản phẩm theo giá giảm dần .");


        Sap_Pham sap_pham = new Sap_Pham(1,"xoai",34);
        Sap_Pham sap_pham1 = new Sap_Pham(2,"cam",21);
        LinkedList<Sap_Pham> list = new LinkedList<>();
        list.add(sap_pham);
        list.add(sap_pham1);
        System.out.println("Danh sách sản phẩm là : ");
        Collections.sort(list);
        for(Sap_Pham sapPham : list)
        {
            System.out.println(sapPham.toString());
        }
    }

    public void Them(Sap_Pham arr[])
    {

    }




}
