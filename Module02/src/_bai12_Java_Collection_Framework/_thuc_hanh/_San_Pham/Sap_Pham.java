package _bai12_Java_Collection_Framework._thuc_hanh._San_Pham;


import _bai12_Java_Collection_Framework._thuc_hanh.Student;

import java.util.Collection;

public class Sap_Pham  implements Comparable<Sap_Pham> {
    private  int id ;
     private  String TenSp;
     private int Gia ;

    public Sap_Pham(int id, String tenSp, int gia) {
        this.id = id;
        TenSp = tenSp;
        Gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String tenSp) {
        TenSp = tenSp;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    @Override
    public String toString() {
        return "Sap_Pham{" +
                "id=" + id +
                ", TenSp='" + TenSp + '\'' +
                ", Gia='" + Gia + '\'' +
                '}';
    }
    @Override
    public int compareTo(Sap_Pham sap_pham)
    {
        return  this.getTenSp().compareTo(sap_pham.getTenSp());
    }


}

