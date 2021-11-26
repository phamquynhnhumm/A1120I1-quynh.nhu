package _bai1_introdution_java.bai_tap;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        int so;
        Scanner nhapso = new Scanner(System.in);
        System.out.println("Nhập vào số không âm tối đa 3 chữ số");
        so = nhapso.nextInt();
        if (so < 20) {
            switch (so) {
                case 0:
                    System.out.println("Số 0");
                    break;
                case 1:
                    System.out.println("Số 1");
                    break;
                case 2:
                    System.out.println("Số 2");
                    break;
                case 3:
                    System.out.println("Số 3");
                    break;
                case 4:
                    System.out.println("Số 4");
                    break;
                case 5:
                    System.out.println("Số 5");
                    break;
                case 6:
                    System.out.println("Số 6");
                    break;
                case 7:
                    System.out.println("Số 7");
                    break;
                case 8:
                    System.out.println("Số 8");
                    break;
                case 9:
                    System.out.println("Số 9");
                    break;
            }
        } else if (so <100) {
            int hangchuc = so / 10;
            int hangdonvi = so % 10;
            String sohangchuc = "không", sohangdonvi = "không";
            switch (hangchuc) {
                case 0:
                    sohangchuc = "không ";
                    break;
                case 1:
                    sohangchuc = "một";
                    break;
                case 2:
                    sohangchuc = "hai ";
                    break;
                case 3:
                    sohangchuc = "ba ";
                    break;
                case 4:
                    sohangchuc = " bốn ";
                    break;
                case 5:
                    sohangchuc = "năm ";
                    break;
                case 6:
                    sohangchuc = "sáu ";
                    break;
                case 7:
                    sohangchuc = "bảy ";
                    break;
                case 8:
                    sohangchuc = "tám ";
                    break;
                case 9:
                    sohangchuc = " chín ";
                    break;

            }
            switch (hangdonvi) {
                case 0:
                    sohangdonvi = "không ";
                    break;
                case 1:
                    sohangdonvi = "một";
                    break;
                case 2:
                    sohangdonvi = "hai ";
                    break;
                case 3:
                    sohangdonvi = "ba ";
                    break;
                case 4:
                    sohangdonvi = " bốn ";
                    break;
                case 5:
                    sohangdonvi = "năm ";
                    break;
                case 6:
                    sohangdonvi = "sáu ";
                    break;
                case 7:
                    sohangdonvi = "bảy ";
                    break;
                case 8:
                    sohangdonvi = "tám ";
                    break;
                case 9:
                    sohangdonvi = " chín ";
                    break;

            }
            System.out.println("đọc thành chữ " + so + "là :" + sohangchuc + " mươi " + sohangdonvi);

        }
        else {
            int hangtram = so / 100;
            int hangchuc = (so-100*hangtram) / 10;
            int hangdonvi = (so- 100*hangtram - 10*hangchuc);
            String sohangtram = "không", sohangchuc = "không", sohangdonvi = "không";
            switch (hangtram) {
                case 0:
                    sohangtram = "không ";
                    break;
                case 1:
                    sohangtram = "một";
                    break;
                case 2:
                    sohangtram = "hai ";
                    break;
                case 3:
                    sohangtram= "ba ";
                    break;
                case 4:
                    sohangtram = " bốn ";
                    break;
                case 5:
                    sohangtram = "năm ";
                    break;
                case 6:
                    sohangtram = "sáu ";
                    break;
                case 7:
                    sohangtram = "bảy ";
                    break;
                case 8:
                    sohangtram= "tám ";
                    break;
                case 9:
                    sohangtram = " chín ";
                    break;

            }
            switch (hangchuc) {
                case 0:
                    sohangchuc = "không ";
                    break;
                case 1:
                    sohangchuc = "một";
                    break;
                case 2:
                    sohangchuc = "hai ";
                    break;
                case 3:
                    sohangchuc = "ba ";
                    break;
                case 4:
                    sohangchuc = " bốn ";
                    break;
                case 5:
                    sohangchuc = "năm ";
                    break;
                case 6:
                    sohangchuc = "sáu ";
                    break;
                case 7:
                    sohangchuc = "bảy ";
                    break;
                case 8:
                    sohangchuc = "tám ";
                    break;
                case 9:
                    sohangchuc = " chín ";
                    break;

            }
            switch (hangdonvi) {
                case 0:
                    sohangdonvi = "không ";
                    break;
                case 1:
                    sohangdonvi = "một";
                    break;
                case 2:
                    sohangdonvi = "hai ";
                    break;
                case 3:
                    sohangdonvi = "ba ";
                    break;
                case 4:
                    sohangdonvi = " bốn ";
                    break;
                case 5:
                    sohangdonvi = "năm ";
                    break;
                case 6:
                    sohangdonvi = "sáu ";
                    break;
                case 7:
                    sohangdonvi = "bảy ";
                    break;
                case 8:
                    sohangdonvi = "tám ";
                    break;
                case 9:
                    sohangdonvi = " chín ";
                    break;
            }
            System.out.println("đọc thành chữ " + so + "là :" +sohangtram+" trăm "+ sohangchuc + " mươi " + sohangdonvi);
        }
    }
}
