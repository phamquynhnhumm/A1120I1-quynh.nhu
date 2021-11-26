package _bai12_Java_Collection_Framework._thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getTuoi() > o2.getTuoi()) {
            return 1;
        } else if (o1.getTuoi() == o2.getTuoi()) {
            return 0;
        } else return -1;
    }
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tung", 38, "HT");

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        System.out.println("______");
        for( Student st : list)
        {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator= new AgeComparator();
         Collections.sort(list,ageComparator);
        System.out.println("so sánh theo tuoi  :\n");
        for(Student st  : list){
            System.out.println(st.toString());
        }




    }


}
