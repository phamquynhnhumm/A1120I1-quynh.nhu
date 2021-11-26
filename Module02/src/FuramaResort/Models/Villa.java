package FuramaResort.Models;

public class Villa extends Services {
    protected String tieuChuanPhong;
    protected String moTaTienNghiKhac;
    protected double dienTichHoBoi;
    protected Integer soTang;

    public Villa() {
    }
    public Villa(int id,String ten, double dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, double dienTichHoBoi, int soTang) {
        super(id,ten, dienTich, chiPhi, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }



    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                ", id= '" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", soLuongNguoi=" + soLuongNguoi +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public Object getMasp() {
        return null;
    }

    public static void main(String[] args) {
        Villa villa = new Villa(9,"vila1", 45.6, 600.60, 6, "nam", "vip", "chpthuxe", 5.6, 10);
        villa.showInfor();
    }
}
