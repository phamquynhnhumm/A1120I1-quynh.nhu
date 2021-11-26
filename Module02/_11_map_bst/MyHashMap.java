package _11_map_bst;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
//        Map<Integer, String> myMap = new HashMap<>();
//        myMap.put(1,"one");
//        myMap.put(2,"two");
//        myMap.put(3,"three");
//        myMap.put(2,"two 2");
//        myMap.put(4, null);
//        myMap.put(5, null);
////        myMap.put(null,"A11");
////        myMap.put(null,"A11 2");
//
//        System.out.println(myMap.get(5));
        Map<Student, String> myMap = new HashMap<>();
        myMap.put(new Student(1, "Nguyen Van A"), "Top1");
        myMap.put(new Student(2, "Nguyen Van B"), "Top3");
        myMap.put(new Student(3, "Nguyen Van D"), "Top5");
        myMap.put(new Student(4, "Nguyen Van C"), "Top4");

        for (Student key : myMap.keySet()) {
            System.out.println("key: " + key + " value: " + myMap.get(key));
        }
    }
}
