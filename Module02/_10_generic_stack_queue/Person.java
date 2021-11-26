package _10_generic_stack_queue;

public class Person {

    public Person(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person_1 = new Person("Hue");
        Person person_3 = new Person("Hong");
        System.out.println(person_1.toString());
        person_1.setName("Binh");
        System.out.println(person_1.toString());
        System.out.println(person_3.toString());
    }
}
