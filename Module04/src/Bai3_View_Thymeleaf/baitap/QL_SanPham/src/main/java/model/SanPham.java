package model;

public class SanPham {
    private int id;
    private String tensp;
    private float gia;
    private String sanxuat;

    public SanPham(int id, String tensp, float gia, String sanxuat) {
        this.id = id;
        this.tensp = tensp;
        this.gia = gia;
        this.sanxuat = sanxuat;
    }

    public SanPham() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getSanxuat() {
        return sanxuat;
    }

    public void setSanxuat(String sanxuat) {
        this.sanxuat = sanxuat;
    }
}
