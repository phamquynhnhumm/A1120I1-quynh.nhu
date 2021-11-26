package model;

public class Sanpham {
    private int id_sanpham;
    private String ten_sanpham;
    private float gia;
    private int soluong;
    private String mausac;
    private String mota;
    private Loai id_loai;

    public Sanpham(int id_sanpham, String ten_sanpham, float gia, int soluong, String mausac, String mota, Loai id_loai) {
        this.id_sanpham = id_sanpham;
        this.ten_sanpham = ten_sanpham;
        this.gia = gia;
        this.soluong = soluong;
        this.mausac = mausac;
        this.mota = mota;
        this.id_loai = id_loai;
    }

    public Sanpham(String ten_sanpham, float gia, int soluong, String mausac, String mota, Loai id_loai) {
//       this.id_sanpham = id_sanpham;
        this.ten_sanpham = ten_sanpham;
        this.gia = gia;
        this.soluong = soluong;
        this.mausac = mausac;
        this.mota = mota;
        this.id_loai = id_loai;
    }



    public int getId_sanpham() {

        return id_sanpham;
    }

    public void setId_sanpham(int id_sanpham)
    {
        this.id_sanpham = id_sanpham;
    }

    public String getTen_sanpham() {
        return ten_sanpham;
    }

    public void setTen_sanpham(String ten_sanpham) {
        this.ten_sanpham = ten_sanpham;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Loai getId_loai() {
        return id_loai;
    }

    public void setId_loai(Loai id_loai) {
        this.id_loai = id_loai;
    }
}
