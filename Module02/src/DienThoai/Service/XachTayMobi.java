package DienThoai.Service;

import DienThoai.Model.MobiChinhHang;
import DienThoai.Model.MobiXachTay;
import FinalExam.Commons.ReadWriteFile;
import FinalExam.Commons.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class XachTayMobi {
    private Regex regex;
    private Scanner sc;
    private ReadWriteFile readWriteFile;
    private String XachTay_PATH ="D:\\A112011PhamThiQuynhNhu\\Module02\\src\\DienThoai\\data\\XachTay.csv";
    private List<MobiXachTay> mobiChinhHangs;
    private CommonMoBi commonService;
    public XachTayMobi(){
        regex = new Regex();
        sc = new Scanner(System.in);
        readWriteFile = new ReadWriteFile();
        mobiChinhHangs = new ArrayList<>();
        commonService = new CommonMoBi();
        getAllChinhHang();
    }
    public List<MobiXachTay> getAllChinhHang(){
        String[] chinhhangListLine = new String[0];
        chinhhangListLine = readWriteFile.readFile(XachTay_PATH ).split("\n");
        for(int i =0;i<chinhhangListLine.length;i++){
            String [] mo = chinhhangListLine[i].split(",");
        //    mobiChinhHangs.add(new MobiXachTay(mo[0],mo[1],mo[2],mo[3],mo[4],mo[5],mo[6]));

        }
        return mobiChinhHangs ;
    }
    public void view(){
        mobiChinhHangs.forEach(x-> System.out.println(x.toString()));
    }
    public List<MobiXachTay> getMoBiChinhHang(){
        return mobiChinhHangs;
    }
    public void inputNewXachTay(){

        System.out.println("-------------------------------------------------");
        System.out.println("Thêm  điện thoai xách tay mới   : ");
        MobiXachTay newMoBiChinhHang = (MobiXachTay) commonService.inputMoBi(1);

        String quocgia;
        String trangthai;
        System.out.print("Nhập vào quốc gia:");
        quocgia = sc.nextLine();
        System.out.print("Nhập vào phạm vi bảo hiểm");
        trangthai= sc.nextLine();
        newMoBiChinhHang.setQuocGia(quocgia);
        newMoBiChinhHang.setTrangThai(trangthai);
        newMoBiChinhHang.setId(mobiChinhHangs.size()+1+"");
        readWriteFile.writeFile(XachTay_PATH ,newMoBiChinhHang.toString(),true);

    }
    public void updateData(){
        String data ="";
        for(int i = 0;i<mobiChinhHangs.size();i++){
            mobiChinhHangs.get(i).setId((i+1)+"");
            data+=mobiChinhHangs.get(i).toString()+"\n";
        }
        readWriteFile.writeFile(XachTay_PATH,data,false);
    }
    public  void searchdt(){
        List<MobiXachTay> ListResult = new ArrayList<>();
        System.out.println("Input key you want to search ");
        String key = sc.nextLine();
        for(MobiXachTay nhapkhau:mobiChinhHangs){
            if(nhapkhau.getMasp().contains(key)){
                ListResult.add(nhapkhau);
            }
        }
        ListResult.forEach(x-> System.out.println(x.toString()));
    }
    public void deletexachtay(){
        System.out.println("Nhập vài id :");
        String id = sc.nextLine();
        for(int i =0;i<mobiChinhHangs.size();i++){
            if(mobiChinhHangs.get(i).getMasp().equals(id)){
                System.out.println("Co san pham");
                System.out.println("yes or no");
                String option = sc.nextLine();
                if(option.equals("yes")){
                    mobiChinhHangs.remove(i);
                    updateData();
                    view();
                }
            }
        }
    }
}
