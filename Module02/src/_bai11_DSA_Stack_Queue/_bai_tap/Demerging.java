package _bai11_DSA_Stack_Queue._bai_tap;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import javax.print.attribute.standard.MediaSize;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Demerging extends  nhansu {
    public Demerging(String ten, String gioitinh) {
        super(ten, gioitinh);
    }
    public static void main(String[] args) {
        int n ;
        System.out.println("  nhập vào số nhân viên :");
        Scanner nhapn  =  new Scanner ( System.in);
        n = nhapn.nextInt();
        Queue<nhansu> Nam = new LinkedList<>();
        Queue<nhansu> Nu =  new LinkedList<>();
        Queue<nhansu> Nhanvien = new LinkedList<>();
        Queue<nhansu> Nhanviendsapxep = new LinkedList<>();
        System.out.println("Nhập vào nhân viên :");
        String ten, gioitinh;
        Scanner nhapten = new Scanner(System.in);
        Scanner nhapgioitinh = new Scanner(System.in);
        for(int i =0;i < n; i ++)
        {
            System.out.println("thứ " + i);
            System.out.print("Tên: ");
            ten = nhapten.nextLine();
            System.out.print("Giới tính : ");
            gioitinh = nhapgioitinh.nextLine();
          //  Nhanvien.offer(new nhansu(ten,gioitinh));
            if(gioitinh.equals("nu"))
            {
                Nu.offer(new nhansu(ten,gioitinh));
                Nhanvien.offer(new nhansu(ten,gioitinh));
            }
            else if(gioitinh.equals("nam"))
            {
                Nam.offer(new nhansu(ten,gioitinh));
            }
        }
        System.out.println("Danh sách nhân viên là :");
      //  System.out.print(Nhanvien);
        System.out.println( "Nv nu"+ Nu);
        System.out.println("Nv nam" + Nam);

    }

     // Chưa ghi vào file
}
