package DienThoai.Model;

public class MobiChinhHang extends Mobi {
    protected    String thoiGianBH;
    protected String phamViBH;
    public MobiChinhHang(String id, String tendt, String giaban, String soluong, String nhasanxuat) {
        super(id, tendt, giaban, soluong, nhasanxuat);
    }
    public MobiChinhHang(String id, String tendt, String giaban, String soluong, String nhasanxuat, String thoiGianBH, String phamViBH) {
        super(id, tendt, giaban, soluong, nhasanxuat);
        this.thoiGianBH = thoiGianBH;
        this.phamViBH = phamViBH;
    }

    public String getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(String thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public String getPhamViBH() {
        return phamViBH;
    }

    public void setPhamViBH(String phamViBH) {
        this.phamViBH = phamViBH;
    }

    @Override
    public String toString() {
        return  getId() +"," +  getTenDT()+"," + getGiaBan()+"," +getSoLuong() +"," +getNhaSanXuat()+"," +getThoiGianBH()+"," +getPhamViBH();
    }
    @Override
    public void showInfor() {

        System.out.println(this.toString());
    }
}
