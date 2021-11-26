package _bai11_DSA_Stack_Queue._bai_tap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

public class chuyen_nhiphan_thapphan {
    public static void main(String[] args) {
        int n;
        Stack<Integer> myStack = new Stack<>();
        Scanner nhapn = new Scanner(System.in);
        System.out.println("Nhập vào số bn muốn chuyển đổi  :");
        n =  nhapn.nextInt();
        System.out.print("Số thập phân : " + n);
         int m =n;
         int k = n;
        int dem =0;
        do{
            n = n/2;
            dem ++;
        }while (n !=0);
        for ( int i =0;i < dem ;i ++)
        {
            int so = m / 2;
            int du = m % 2;
            myStack.push(du);
            m = so;
        }
        int [] ar = new int[dem];
/*
        System.out.println(myStack);
*/

        System.out.print("\nSố được chuyển sang nhị phân là :");
        Stack<Integer> myStack1 = new Stack<>();
        for(int i =0 ;i < dem;i ++)
        {
            int b = myStack.peek() ;
            myStack1.push(b);
            int  c = myStack1.peek();
            ar[i] = c;
            System.out.print(c);
            myStack.pop();
        }
        /*System.out.println(myStack1);
        for(int i =0 ;i < dem;i ++)
        System.out.println(ar[i]);*/
    }

}
