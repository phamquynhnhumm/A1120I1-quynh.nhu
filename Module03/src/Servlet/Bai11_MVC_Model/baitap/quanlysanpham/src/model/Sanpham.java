package model;

public class Sanpham {
    private int id;
    private  String ten;
    private int gia;
    private  String  mota;
    private  String nhaxb;

    public Sanpham(int id, String ten, int gia, String mota, String nhaxb) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.mota = mota;
        this.nhaxb = nhaxb;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }
}
