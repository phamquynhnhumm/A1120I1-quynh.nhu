package _10_generic_stack_queue;

public class Student extends Person {
    private int age;

    public Student(String name, int age) {
        super(name);
        this.age = age;
    }

    public Student(String name) {
        super(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(int zz){
        System.out.println("Student name: "+super.getName());
    }

    public void showInfo() {
        System.out.println("Student name: " + super.getName() + "Age: "+age);
    }
}
