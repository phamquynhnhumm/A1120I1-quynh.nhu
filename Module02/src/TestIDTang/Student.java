package TestIDTang;

public class Student {
    private static int idTemp = 1; // need a temp id
    private int id;
    private String name;

    Student(String name) { // each time we create new Student idTemp will be auto increas by 1
        this.id = idTemp++; // set id equal idTemp
        this.name = name;
    }

    public String toString() {
        return "User: " + name + " " + id;
    }

}
