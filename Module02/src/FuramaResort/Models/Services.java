package FuramaResort.Models;

public abstract class Services implements Comparable<Services> {

    private static int idTemp = 1;
    protected int id;
    protected String ten;


    protected double dienTich;
    protected double chiPhi;
    protected int soLuongNguoi;
    protected String kieuThue;

    public Services() {
    }


    public Services(int id, String ten, double dienTich, double chiPhi, int soLuongNguoi, String kieuThue) {
        this.id = idTemp++;
        this.ten = ten;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        Services.idTemp = idTemp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                "ten='" + ten + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", soLuongNguoi=" + soLuongNguoi +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public abstract void showInfor();

    public int compareTo(Services second) {

        // so sánh theo tên
        int result = this.ten.compareTo(second.ten);

        // int result = this.dienTich.compareTo(second.dienTich);
        // result == 0  cùng tên thì so sánh theo năm sinh
        if (result == 0) {
            int namSinhthu1 = (this.soLuongNguoi); // split lấy phần tử thứ 2 sau  dấu  "/  tức là lấy nam
            int namSinhthu2 = (this.soLuongNguoi); // split lấy phần tử thứ 2 sau  dấu  "/  tức là lấy nam
            result = namSinhthu2 - namSinhthu1;

        }
        return result;
    }

    public abstract Object getMasp();
}
