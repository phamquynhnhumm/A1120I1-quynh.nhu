package _bai11_DSA_Stack_Queue._bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.net.Socket;
import java.util.Scanner;
import java.util.Stack;

public class chuoi_Palindrome {
    public static void main(String[] args) {
        String n;
        System.out.println("Nhập vào chuỗi :");
        Scanner chuoi = new Scanner(System.in);
        n = chuoi.nextLine();
        System.out.println(n);
        Stack<String> myStack2 = new Stack<>();
        Stack<String> myStack = new Stack<>();
        for(  int  i =0 ;i < n.length();i ++)
        {
           char ar = n.charAt(i);
           String b = Character.toString(ar); // ép kiểu char sang string
           myStack.push(b);
           myStack2.push(b);
        }
       /* System.out.println( "chua doi:"+myStack);*/
        Stack<String> myStack1 = new Stack<>();
        for(int i =0 ;i < n.length() ;i ++)
        {
            String b = myStack.peek() ;
            myStack1.push(b);
            myStack.pop();
        }
        int dem  = 0;
      /*  System.out.println( "chua doi2:"+myStack2);
        System.out.println( "da doi1 :"+myStack1);*/
        for(int i =0 ;i < n.length() ;i ++){
            String k = myStack1.peek();
            String k1 = myStack2.peek();
            if(k.equals(k1))
            {
               dem ++;
            }
            else {
                System.out.println("Chuỗi đó không phải là chuỗi Palindrome!");
                break;
            }
            myStack1.pop();
            myStack2.pop();
        }
        if(dem == n.length()){
            System.out.println("Chuỗi đólà chuỗi Palindrome!");
        }

    }
}
