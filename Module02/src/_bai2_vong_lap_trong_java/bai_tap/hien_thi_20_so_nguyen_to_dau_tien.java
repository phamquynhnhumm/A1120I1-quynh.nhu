package _bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {

        for(int  k =0;k<20;k++)
        {
            int status = 1;
            for (int i = 2; i <= 100; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        status = 0;
                    }
                }
                if (status != 0) {
                    System.out.println(i);
                    i++;
                }
                status = 1;
            }
        }

    }
}



