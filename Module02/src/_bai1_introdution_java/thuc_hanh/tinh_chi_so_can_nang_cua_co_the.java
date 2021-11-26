package _bai1_introdution_java.thuc_hanh;

import java.util.Scanner;

public class tinh_chi_so_can_nang_cua_co_the {
    public static void main(String[] args) {
        float nang, cao, BMI;
        Scanner cannang = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng :");
        nang = cannang.nextFloat();
        Scanner chieucao = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao :");
        cao = chieucao.nextFloat();
        BMI = nang / (cao*cao);
        if(BMI < 18.5)
        {
            System.out.println("Interpretation : Underweight ");
        }else  if(BMI < 25.0 && 18.5<= BMI)
        {
            System.out.println("Interpretation : Normal");
        }
        else if(25.0 <= BMI && BMI <30.0)
        {
            System.out.println("Interpretation :Overweight ");
        }
        else {
            System.out.println("Interpretation : obese");
        }
    }
}
