package DienThoai.Model;

public abstract class Mobi {
    protected  String id;
    protected  String tenDT;
     protected  String giaBan;
     protected String soLuong;
     protected  String nhaSanXuat;

    public Mobi(String id, String tenDT, String giaBan, String soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenDT = tenDT;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }
    public String getMasp() {
        return id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "Mobi{" +
                "id='" + id + '\'' +
                ", tenDT='" + tenDT + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }

    public void showInfor() {

        System.out.println(this.toString());
    }
}
