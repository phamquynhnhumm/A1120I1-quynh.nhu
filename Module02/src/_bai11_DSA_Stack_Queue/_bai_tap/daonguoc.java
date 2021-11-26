package _bai11_DSA_Stack_Queue._bai_tap;

import java.util.Stack;
import java.util.Scanner;

public class daonguoc {
    public static void main(String[] args) {

        int  n, m;
        System.out.println("Nhập vào số phần tử trong mảng :");
        Scanner nhapn = new Scanner(System.in);
        n  = nhapn.nextInt();
        Stack<Integer> myStack = new Stack<>(); // khai baos stack
        System.out.println("Nhập vào các phần tử trong mảng stack: ");
        Scanner nhapm = new Scanner(System.in);

       for(int i =0 ;i < n ;i ++)
       {
           m  = nhapm.nextInt();
            myStack.push(m);
       }

        System.out.println("Mảng vừa nhập là :");
       System.out.println(myStack);
        System.out.println("Mảng sau khi đã đảo ngược là :");

        Stack<Integer> myStack1 = new Stack<>();
        for(int i =0 ;i < n ;i ++)
        {
           int b = myStack.peek() ;
           myStack1.push(b);
           myStack.pop();
        }
        System.out.println(myStack1);
    }
}
