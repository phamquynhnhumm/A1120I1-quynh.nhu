package _bai5_Accessmodifier_staticmethod_staticproperty._thuchanh;

public class static_use {
    public static void main(String args[]) {
        access obj1 = new access();
        access obj2 = new access();
        obj1.x = 0;
        obj1.y = 0;
        obj1.cal(1, 2);
        obj2.x = 0;
        obj2.cal(2, 3);
        System.out.println(obj1.x + " " + obj2.y);
    }
}
