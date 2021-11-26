package _bai19_String_Regex._Thuc_hanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static final String Id_Khachhang = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$";

    public static boolean test(String regex) {
        Pattern pattern = Pattern.compile(Id_Khachhang);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


    public static void main(String[] args) {

        String ten;
        boolean kq = true;
        do {

            System.out.println("Nhập vào chuỗi bạn muốn kiểm tra");

            Scanner nhap = new Scanner(System.in);
            ten = nhap.nextLine();
            String[] validAccount = new String[]{ten};
            for (String account : validAccount) {


                kq = test(account);
                System.out.println("acconut " + account +"   "+ kq +"  " + ten);

                if (kq == false)
                {
                    System.out.println("Bạn hãy nhập lại cho đúng định dạng");
                }

            }
        }
        while (kq == false);

        System.out.println("xong" + ten +"   " + kq);
    }
}
