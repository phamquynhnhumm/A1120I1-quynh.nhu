package DienThoai.Model;

public class MobiXachTay  extends  Mobi{
     protected   String quocGia;
     protected    String trangThai;

    public MobiXachTay(String id, String tendt, String giaban, String soluong, String nhasanxuat) {
        super(id, tendt, giaban, soluong, nhasanxuat);
    }
    public MobiXachTay(String id, String tendt, String giaban, String soluong, String nhasanxuat, String quocGia, String trangThai) {
        super(id, tendt, giaban, soluong, nhasanxuat);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return  getId() +"," +  getTenDT()+"," + getGiaBan()+"," +getSoLuong() +"," +getNhaSanXuat()+"," + getQuocGia() +"," + getTrangThai();
    }
    @Override
    public void showInfor() {

        System.out.println(this.toString());
    }
}
