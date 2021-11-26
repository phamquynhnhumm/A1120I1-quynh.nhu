package _bai12_Java_Collection_Framework._baitap;

import java.util.List;

public class chucnangsp {
    public List<sanpham> sanphams;

    public chucnangsp(List<sanpham> sanphams) {
        this.sanphams = sanphams;
    }

    public List<sanpham> getSanphams() {
        return sanphams;
    }

    public void setSanphams(List<sanpham> sanphams) {
        this.sanphams = sanphams;
    }

    public void them(sanpham sanphams1) {
        this.sanphams.add(sanphams1);
    }

    public void xoa(int sanphamk1) {

        System.out.println(sanphamk1+"  dã thực hiện xóa" +  this.sanphams.remove(sanphamk1));
    }
   // public  void

}
