package _bai13_Thuat_toan_tim_kiem._thuc_hanh;

import java.util.Scanner;
import java.util.Stack;

public class tinh_do_phuc_tap_cua_thuat_toan {
    public static void main(String[] args) {
        Scanner  nhapchuoi = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi :");
        String chuoi = nhapchuoi.nextLine();
        System.out.println("chuỗi đó là :" + chuoi);
        String  [] arr = new  String[chuoi.length()];
        Stack<String> myStack = new Stack<>();
        for(  int  i =0 ;i < chuoi.length();i ++)
        {
            char ar = chuoi.charAt(i);
            String b = Character.toString(ar); // ép kiểu char sang string
            arr[i] = b;
        }

        for( int i =0 ;i < chuoi.length();i ++)
        {
            String k;
            k = arr[i];
            System.out.println(k + " và ");
             for( int j = i  ;j< chuoi.length();j ++)
             {
                 if(k == arr[j])
                 {

                 }
             }
        }
    }


}
