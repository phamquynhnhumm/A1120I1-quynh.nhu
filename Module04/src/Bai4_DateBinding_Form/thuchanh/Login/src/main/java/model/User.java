package model;

public class User {
    private String  taikhoan;
    private  String matkhau;
    private  String ten;
    private String email;
    private int tuoi;

    public User(String taikhoan, String matkhau, String ten, String email, int tuoi) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.ten = ten;
        this.email = email;
        this.tuoi = tuoi;
    }

    public User() {

    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
