package _bai5_Accessmodifier_staticmethod_staticproperty._thuchanh;

public class testStaticMethod {
    public static void main(String[] args) {
        StaticMethod.Change();
        StaticMethod s1 = new StaticMethod(111, "như");
        StaticMethod s2 = new StaticMethod(222, "nga");
        StaticMethod s3 = new StaticMethod(333, "Xoan");

        s1.display();
        s2.display();
        s3.display();
    }
}


