package FuramaResort.Models;

public class Employee {
    protected   String id;
    protected  String fullName;
    protected String dataNgaySinh;
    protected  String address;

    public Employee(String id, String fullName, String dataNgaySinh, String address) {
        this.id = id;
        this.fullName = fullName;
        this.dataNgaySinh = dataNgaySinh;
        this.address = address;
    }

    public Employee() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDataNgaySinh() {
        return dataNgaySinh;
    }

    public void setDataNgaySinh(String dataNgaySinh) {
        this.dataNgaySinh = dataNgaySinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dataNgaySinh='" + dataNgaySinh + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
