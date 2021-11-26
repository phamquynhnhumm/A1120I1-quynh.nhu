package FuramaResort.Models;

public class Customer implements Comparable<Customer> {
    protected String hoTenKhach;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String soCMND;
    protected String soDT;
    protected String email;
    protected String loaiKhach;
    protected String diaChi;
    protected Services services;

    public Customer() {
    }

    public Customer(String hoTenKhach, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email, String loaiKhach, String diaChi, Services services) {
        this.hoTenKhach = hoTenKhach;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.services = services;
    }

    public String getHoTenKhach() {
        return hoTenKhach;
    }

    public void setHoTenKhach(String hoTenKhach) {
        this.hoTenKhach = hoTenKhach;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "hoTenKhach='" + hoTenKhach + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", soDT='" + soDT + '\'' +
                ", email='" + email + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public void showInfor() {

        System.out.println(this.toString());
    }
    //implements Comparable<Customer> so sánh theo kiểu customer

    @Override
    public int compareTo(Customer second) {

       // so sánh theo tên
        int result = this.hoTenKhach.compareTo(second.hoTenKhach);
        // result == 0  cùng tên thì so sánh theo năm sinh
         if(result == 0)
        {
             int namSinhthu1 = Integer.parseInt(this.ngaySinh.split("/")[2]); // split lấy phần tử thứ 2 sau  dấu  "/  tức là lấy nam
            int namSinhthu2 = Integer.parseInt(this.ngaySinh.split("/")[2]); // split lấy phần tử thứ 2 sau  dấu  "/  tức là lấy nam
            result = namSinhthu1- namSinhthu1;
        }
        return 0;
    }
}
