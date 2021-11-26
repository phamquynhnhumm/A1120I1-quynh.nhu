package _10_generic_stack_queue;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void showElement(Object[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + "\t");
        }
        System.out.println("\n----");
    }

    public static <T> void showElement2(T[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + "\t");
        }
        System.out.println("\n----");
    }

    public static void main(String[] args) {
//        Integer[] intArr = {1, 2, 3};
//        Double[] doubleArr = {1.1, 2.2, 3.3};
//        String[] stringArr = {"one", "two", "three"};
//
//        showElement2(intArr);
//        showElement2(doubleArr);
//        showElement2(stringArr);

        List<Double> myList = new ArrayList();
        myList.add(1.1);
        myList.add(2.2);
        myList.add(3.3);

        List myList1 = new ArrayList();
        myList1.add(1);
        myList1.add(2.2);
        myList1.add("abc");



    }
}
