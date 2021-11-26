package _bai13_Thuat_toan_tim_kiem._thuc_hanh;

import java.util.Scanner;

public class cai_dat_thuat_toan_tim_kiem_nhi_phan {
   static int[] list={1,3,4,5,7,8,10,14,37,48,53,67,76,87,88};

    public static void main(String[] args) {
        int n;
        Scanner nhapn =  new Scanner(System.in);
        System.out.println("Nhập vào số bn muốn tìm kiếm trong mảng :");
        n = nhapn.nextInt();
        if (timkiemnhhi(list,n) == -1)
        {
            System.out.println("Không tìm thấy số đó trong chuỗi!");
        }
        else {

            System.out.println("Số " + n +" Thuộc vị trí thứ : ");
            System.out.println( timkiemnhhi(list,n));
        }
    }
   static int timkiemnhhi(int arr[], int value)
   {
       int low= 0;
       int hight = list.length-1;
       while (hight>low)
       {
           int mid = (low +hight)/2;
           if(value <list[mid])
           {
               hight = mid-1;
           }
           else if( value== list[mid])
           {
               return mid;
           }
           else
               low= mid+1;
       }
       return  -1;
   }
}
