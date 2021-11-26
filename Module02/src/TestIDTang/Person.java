package TestIDTang;

public class Person {
    public static void main(String[] args)
    {
        Student student = null;
        for(int i = 0 ; i<5; i++){
            student = new Student("Do Quan ");
            System.out.println(student.toString());
        }
    }
}
