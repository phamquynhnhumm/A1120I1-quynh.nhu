package _15_exception;

import java.util.Scanner;

public class Test {

    public static void inputStudent() throws IdCheckingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input id: ");
        int id = scanner.nextInt();

        if (id < 0) {
            throw new IdCheckingException("id bi am");
        }
        System.out.println("id vua nhap la: "+id);
    }


    public static void main(String[] args) {
        try {
            inputStudent();
        } catch (IdCheckingException e) {
            System.out.print("co loi nhe: "+e.getMessage());
        }

        Student student1 = new Student(1, "a");
        Student student2 = new Student(2, "b");
    }
}
