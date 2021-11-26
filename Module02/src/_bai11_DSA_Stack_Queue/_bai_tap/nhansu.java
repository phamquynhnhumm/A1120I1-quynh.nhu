package _bai11_DSA_Stack_Queue._bai_tap;

public class nhansu {
    private  String ten;
    private String  gioitinh;

    public nhansu(String ten, String gioitinh) {
        this.ten = ten;
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "nhansu{" +
                "ten='" + ten + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                '}';
    }
}
