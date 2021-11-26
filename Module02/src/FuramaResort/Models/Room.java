package FuramaResort.Models;

public class Room extends Services {
  protected Dichvudikem dichvudikem;

    public Room() {
    }

    public Room(Dichvudikem dichvudikem) {
        this.dichvudikem = dichvudikem;
    }

    public Room(int id,String ten, double dienTich, double chiPhi, int soLuongNguoi, String kieuThue, Dichvudikem dichvudikem) {
        super(id,ten, dienTich, chiPhi, soLuongNguoi, kieuThue);
        this.dichvudikem = dichvudikem;
    }

    public Dichvudikem getDichvudikem() {
        return dichvudikem;
    }

    public void setDichvudikem(Dichvudikem dichvudikem) {
        this.dichvudikem = dichvudikem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichvudikem=" + dichvudikem.toString()+
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
