package DienThoai.Service;

import DienThoai.Model.MobiChinhHang;
import FinalExam.Commons.ReadWriteFile;
import FinalExam.Commons.Regex;
import FinalExam.Model.SPNhapKhau;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChinhHangMobi {
    private Regex regex;
    private Scanner sc;
    private ReadWriteFile readWriteFile;
    private String CHINHHANG_PATH ="D:\\A112011PhamThiQuynhNhu\\Module02\\src\\DienThoai\\data\\ChinhHang.csv";
    private List<MobiChinhHang>  mobiChinhHangs;
    private CommonMoBi commonService;
    public ChinhHangMobi(){
        regex = new Regex();
        sc = new Scanner(System.in);
        readWriteFile = new ReadWriteFile();
        mobiChinhHangs = new ArrayList<>();
        commonService = new CommonMoBi();
        getAllChinhHang();
    }
    public List<MobiChinhHang> getAllChinhHang(){
        String[] chinhhangListLine = new String[0];
        chinhhangListLine = readWriteFile.readFile(CHINHHANG_PATH).split("\n");
        for(int i =0;i<chinhhangListLine.length;i++){
            String [] mo = chinhhangListLine[i].split(",");
            mobiChinhHangs.add(new MobiChinhHang(mo[0],mo[1],mo[2],mo[3],mo[4],mo[5],mo[6]));

        }
        return mobiChinhHangs ;
    }
    public void view(){
        mobiChinhHangs.forEach(x-> System.out.println(x.toString()));
    }
    public List<MobiChinhHang> getMoBiChinhHang(){
        return mobiChinhHangs;
    }
    public void inputNewChinhHang(){

        System.out.println("-------------------------------------------------");
        System.out.println("Thêm  điện thoại chính hãng mới   : ");
        MobiChinhHang newMoBiChinhHang = (MobiChinhHang) commonService.inputMoBi(1);

        String thoigianbh;
        String phamvibh;
        System.out.print("Nhập vào thời gian bảo hiểm :");
        thoigianbh = sc.nextLine();
        System.out.print("Nhập vào phạm vi bảo hiểm");
        phamvibh = sc.nextLine();
        newMoBiChinhHang.setThoiGianBH(thoigianbh);
        newMoBiChinhHang.setPhamViBH(phamvibh);
        newMoBiChinhHang.setId(mobiChinhHangs.size()+1+"");
        readWriteFile.writeFile(CHINHHANG_PATH,newMoBiChinhHang.toString(),true);

    }
    public void updateData(){
        String data ="";
        for(int i = 0;i<mobiChinhHangs.size();i++){
            mobiChinhHangs.get(i).setId((i+1)+"");
            data+=mobiChinhHangs.get(i).toString()+"\n";
        }
        readWriteFile.writeFile(CHINHHANG_PATH,data,false);
    }
    public  void searchdt(){
        List<MobiChinhHang> ListResult = new ArrayList<>();
        System.out.println("Nhập vài id  ");
        String key = sc.nextLine();
        for(MobiChinhHang nhapkhau:mobiChinhHangs){
            if(nhapkhau.getMasp().contains(key)){
                ListResult.add(nhapkhau);
            }
        }
        ListResult.forEach(x-> System.out.println(x.toString()));
    }
    public void deleteNhapKhau(){
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
