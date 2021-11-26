package FuramaResort.Models;

public class Dichvudikem {
    protected String tenDV;
    protected String donVi;
    protected double tien;

    public Dichvudikem(String tenDV, String donVi, double tien) {
        this.tenDV = tenDV;
        this.donVi = donVi;
        this.tien = tien;
    }
    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    @Override
    public String toString() {
        return "Dichvudikem{" +
                "tenDV='" + tenDV + '\'' +
                ", donVi='" + donVi + '\'' +
                ", tien=" + tien +
                '}';
    }
}
