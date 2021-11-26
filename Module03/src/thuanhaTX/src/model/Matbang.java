package model;

public class Matbang {
    private  String id_matbang ;
    private String trangthai;
    private float dientich;
    private  int tang;
    private  String loai;
    private  float gia;
    private  String ngaybatdau;
    private String ngayketthuc;

    public Matbang(String id_matbang, String trangthai, float dientich, int tang, String loai, float gia, String ngaybatdau, String ngayketthuc) {
        this.id_matbang = id_matbang;
        this.trangthai = trangthai;
        this.dientich = dientich;
        this.tang = tang;
        this.loai = loai;
        this.gia = gia;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public String getId_matbang() {
        return id_matbang;
    }

    public void setId_matbang(String id_matbang) {
        this.id_matbang = id_matbang;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(String ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public String getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(String ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }
}
