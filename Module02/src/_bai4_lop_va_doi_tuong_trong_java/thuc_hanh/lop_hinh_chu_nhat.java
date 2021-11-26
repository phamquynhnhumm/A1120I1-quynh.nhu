package _bai4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class lop_hinh_chu_nhat {
    public static void main(String[] args) {
        double dai,rong ;
        Scanner nhapdai = new Scanner(System.in);
        System.out.println("nhập vào chiều dài :");
        dai = nhapdai.nextFloat();

        Scanner nhaprong = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng:");
        rong = nhaprong.nextFloat();
        lop_hinh_chu_nhat hinhchunhat = new lop_hinh_chu_nhat(dai,rong);
        System.out.println("Diện thi của hình chữ nhật là :" + hinhchunhat.dientich());
        System.out.println("Chu vi hình chữ nhật là :" + hinhchunhat.chivi());
        System.out.println(hinhchunhat.hienthi());
    }

    public double dai;
    public double rong;

    public lop_hinh_chu_nhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;

    }

    public lop_hinh_chu_nhat() {

    }

    public double dientich() {
        return this.dai * this.rong;
    }

    public double chivi() {
        return (this.dai + this.rong) * 2;
    }

    public String hienthi() {
      return  ("hình chữ nhật có kích thướng là :\n rộng :" + this.rong + "và dài  :" + this.dai);
    }

}
