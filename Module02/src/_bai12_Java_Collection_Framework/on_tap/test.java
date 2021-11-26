package _bai12_Java_Collection_Framework.on_tap;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Person studen1 = new Student("nhu",43,10);
        Person studen2 = new Student("nhung",3,50);
        Person studen3 = new Student("nhung",85,50);



        Person teacher1 = new Teacher("huy",43,5);
        Person teacher2= new Teacher("huynh",3,7);

        PersonManaer  personManaer = new PersonManaer( new ArrayList<>());
      // tính đa hình khởi tạo ông cha trong hình hài của đứa con
        personManaer.Them(studen1);
        personManaer.Them(studen2);

        personManaer.Them(teacher1);
        personManaer.Them(teacher2);

         for (Person person : personManaer.getPersonList())
         {
             System.out.println(person);

         }
        System.out.println(" sửa______________________");
          personManaer.sua(studen3);
        for (Person person : personManaer.getPersonList())
        {
            System.out.println(person);
        }
        System.out.println("_______Xóa ____");
        personManaer.Xoa(studen3);
        for (Person person : personManaer.getPersonList())
        {
            System.out.println(person);
        }


    }
}
