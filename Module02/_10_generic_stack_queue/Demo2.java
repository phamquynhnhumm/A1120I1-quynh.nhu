package _10_generic_stack_queue;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    public static  void showElement2(List<? extends Person> arr) {
        for (int index = 0; index < arr.size(); index++) {
            System.out.print(arr.get(index) + "\t");
        }
        System.out.println("\n----");
    }

    public static void main(String[] args) {
        List<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);

        List<Double> doubleArr = new ArrayList<>();
        doubleArr.add(1.1);
        doubleArr.add(2.2);

        List<String> strArr = new ArrayList<>();
        strArr.add("one");
        strArr.add("two");

//        showElement2(intArr);
//        showElement2(doubleArr);
//        showElement2(strArr);
    }
}
