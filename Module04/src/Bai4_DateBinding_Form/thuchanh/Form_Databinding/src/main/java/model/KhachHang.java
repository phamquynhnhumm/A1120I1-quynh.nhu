package model;

public class KhachHang {

    private String id;
    private String ten;
    private String sdt;

    public KhachHang(String id, String ten, String sdt) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
    }
    public KhachHang(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
