package _bai12_Java_Collection_Framework._thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class hasMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ahu", 48);
        hashMap.put("Buynh",59);
        hashMap.put("Canh",8);
        System.out.println("Danh sach sinh vien la :");
        System.out.println(hashMap +"\n");

        System.out.println("_______________");
          Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("   nguyen ", 48);
        treeMap.put("phah",9);
        treeMap.put("tran",8);
        System.out.println(treeMap + "\n");
        System.out.println("_____________");

         Map<String, Integer> linkMap = new LinkedHashMap<>();
         linkMap.put("a",6);
         linkMap.put("f",3);
         linkMap.put("c",9);
        System.out.println(linkMap +"/n");
    }
}
