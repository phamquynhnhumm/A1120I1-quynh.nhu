package model;

public class KhachHang {
    private int id;
    private String ten;
    private String email;
    private String diachi;

    public KhachHang(int id, String ten, String email, String diachi) {
        this.id = id;
        this.ten = ten;
        this.email = email;
        this.diachi = diachi;
    }
    public KhachHang() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
