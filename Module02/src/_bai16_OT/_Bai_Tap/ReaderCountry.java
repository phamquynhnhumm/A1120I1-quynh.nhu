package _bai16_OT._Bai_Tap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderCountry {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\A112011PhamThiQuynhNhu\\Module02\\src\\FinalExam\\data\\NhapKhau.csv"));
            String line = null;
            int i =1;
            String doubleQuote = String.valueOf((char)34);
            while ((line = reader.readLine())!=null){
                String [] arr =line.split(",");
                System.out.print(i+". Country "+arr[4].replace(doubleQuote,"")+" " +arr[5].replace(doubleQuote,""));
                System.out.println();
                i++;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
