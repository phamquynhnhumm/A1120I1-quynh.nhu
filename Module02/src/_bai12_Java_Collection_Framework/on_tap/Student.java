package _bai12_Java_Collection_Framework.on_tap;

public class Student extends Person {
    private int diem;

    public Student(String name, int age, int diem) {
        super(name, age);
        this.diem = diem;
    }

    public Student() {
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() + ","+
                "diem=" + diem +
                '}';
    }
    @Override
    public void showInfo() {
        this.toString();
    }

}


// chú Ý  : Override ưu tiên triển khai lớp thằng con trước nếu con ko có mớ gọi Tostring cú cha
