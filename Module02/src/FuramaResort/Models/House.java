package FuramaResort.Models;

public class House extends Services {
    protected String tieuChuan;
    protected String moTaTienNghiKhac;
    protected int soTang;

    public House() {
    }

    public House(int id,String ten, double dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuan, String moTaTienNghiKhac, int soTang) {
        super(id,ten, dienTich, chiPhi, soLuongNguoi, kieuThue);
        this.tieuChuan = tieuChuan;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuan='" + tieuChuan + '\'' +
                ", moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                ", soTang=" + soTang +
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


}
