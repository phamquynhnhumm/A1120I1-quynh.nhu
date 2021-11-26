package _bai1_introdution_java.bai_tap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
           float tien,vnd;
        Scanner nhaptien = new Scanner(System.in);
        System.out.println("Nhập vào số tiền mệnh giá usd");
        tien = nhaptien.nextFloat();
        vnd=  tien *23000;
        System.out.println("Được chuyển sang vnd là :" +vnd);

        for(int i=1; i<=5; i++){
            if(i==1) break;
            System.out.println("Hello");

    }
    }
}

