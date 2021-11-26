package _bai1_introdution_java.thuc_hanh;

import java.util.Scanner;

public class su_dung_toan_tu {

    public static void main(String[] args) {
        float cao, dai;
        Scanner nhapcao = new Scanner(System.in);
        System.out.println(" nhập chiều cao là  :");
        cao = nhapcao.nextFloat();

        Scanner nhapdai = new Scanner(System.in);
        System.out.println("nhập chiều dài là  : ");
        dai = nhapdai.nextFloat();
        float dientich;
        dientich = cao * dai;
        System.out.println("diện tích hình chữ nhật là  :" + dientich);
    }
}

