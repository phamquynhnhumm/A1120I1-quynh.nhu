package _bai11_DSA_Stack_Queue._bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class kiem_tra_dau_ngoac {
    public static void main(String[] args) {
        String n;
        System.out.println("Nhập vào  biểu thức bạn muốn kiểm tra:");
        Scanner nhapn = new Scanner(System.in);
        n = nhapn.nextLine();
        Stack<String> myStack = new Stack<>();
        Stack<String> myStack1 = new Stack<>();
        Stack<String> myStack2 = new Stack<>();
        for (int i = 0; i < n.length(); i++) {
            char ar = n.charAt(i);
            String b = Character.toString(ar); // ép kiểu char sang string
            myStack.push(b);
            myStack1.push(b);
        }
        System.out.println(myStack);
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '(') {
                myStack2.push("(");
            }
        }
        System.out.println( "mảng chứa dấu ngoặc" +myStack2);
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == ')' && !myStack2.empty()) {
                for (int j= 0;j <i;j ++)
                {
                    if (n.charAt(j) == '('  && !myStack2.empty())
                    {
                        myStack2.pop();
                    }
                }
            }
        }
        System.out.println( "mảng chứa dấu ngoặc đã xóa" +myStack2);
        if(myStack2.empty())
        {
            System.out.println("dấu ngoặc hợp lệ");
        }
        else System.out.println("Dấu ngoặc không hợp lệ!");

    }
}
/*
    Ý tưởng: Duyệt qua từng dấu ngoặc trong dãy ngoặc; Sử dụng một stack để push các dấu ngoặc mở vào stack,
    mỗi khi gặp dấu ngoặc đóng, thực hiện pop một phần tử khỏi stack. Dãy ngoặc sẽ không hợp lệ khi bạn không
    thể pop hoặc khi kết thúc duyệt mà stack vẫn chưa rỗng.*/
