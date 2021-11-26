package _bai12_Java_Collection_Framework._thuc_hanh;

public class Student  implements Comparable<Student>{
    private  String ten ;
     private int tuoi;
     private  String diachi ;

    public Student(String ten, int tuoi, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Student(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student student)
    {
        return  this.getTen().compareTo(student.getTen());
    }

}
