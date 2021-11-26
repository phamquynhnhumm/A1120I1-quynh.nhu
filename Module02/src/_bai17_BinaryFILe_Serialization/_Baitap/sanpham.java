package _bai17_BinaryFILe_Serialization._Baitap;

import java.io.DataOutputStream;
import java.io.Serializable;

public class sanpham implements Serializable {
    private String MaSp;
     private  String TenSP;
     private String HangSP;
     private int Gia;
      private  String Motakhach;

    public sanpham(String maSp, String tenSP, String hangSP, int gia, String motakhach) {
        MaSp = maSp;
        TenSP = tenSP;
        HangSP = hangSP;
        Gia = gia;
        Motakhach = motakhach;
    }

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String maSp) {
        MaSp = maSp;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getHangSP() {
        return HangSP;
    }

    public void setHangSP(String hangSP) {
        HangSP = hangSP;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public String getMotakhach() {
        return Motakhach;
    }

    public void setMotakhach(String motakhach) {
        Motakhach = motakhach;
    }

    @Override
    public String toString() {
        return "sanpham{" +
                "MaSp='" + MaSp + '\'' +
                ", TenSP='" + TenSP + '\'' +
                ", HangSP='" + HangSP + '\'' +
                ", Gia=" + Gia +
                ", Motakhach='" + Motakhach + '\'' +
                '}';
    }
}
