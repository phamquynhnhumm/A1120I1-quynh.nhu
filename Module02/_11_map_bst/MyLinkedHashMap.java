package _11_map_bst;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new LinkedHashMap<>();
        myMap.put(new Student(1, "Nguyen Van A"), "Top1");
        myMap.put(new Student(2, "Nguyen Van B"), "Top3");
        myMap.put(new Student(4, "Nguyen Van C"), "Top4");
        myMap.put(new Student(3, "Nguyen Van D"), "Top5");

        for (Student key : myMap.keySet()) {
            System.out.println("key: " + key + " value: " + myMap.get(key));
        }
    }
}
