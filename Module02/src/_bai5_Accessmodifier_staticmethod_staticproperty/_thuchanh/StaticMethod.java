package _bai5_Accessmodifier_staticmethod_staticproperty._thuchanh;

import java.rmi.StubNotFoundException;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "PTQN2809";
    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }
    static void Change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}