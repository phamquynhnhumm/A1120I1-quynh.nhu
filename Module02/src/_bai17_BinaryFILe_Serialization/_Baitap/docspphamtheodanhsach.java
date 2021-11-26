//package _bai17_BinaryFILe_Serialization._Baitap;
//
//import _bai12_Java_Collection_Framework._thuc_hanh.Student;
//import _bai12_Java_Collection_Framework._thuc_hanh._San_Pham.Sap_Pham;
//
//import java.io.*;
//
//public class docspphamtheodanhsach {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        sanpham  sanpham1= new sanpham("3wsgs", "Sữa rửa mặt",   "nihongo",567.8,"do dễ vỡ" );
//
//        sanpham  sanpham2= new sanpham("3wsgs1", "Sữa rửa mặt1",   "nihongo2",56337.8,"do dễ vỡ" );
//        sanpham  sanpham3= new sanpham("3wsgs2", "Sữa rửa mặt3",   "nihongo2",5367.8,"do dễ vỡ" );
//
//        /*  ghi file*/
//        try
//        {
//            FileOutputStream fos = new FileOutputStream("sanpham.txt");
//            ObjectOutputStream oos= new ObjectOutputStream(fos);
//            oos.writeObject(sanpham1);
//            oos.writeObject(sanpham2);
//            oos.writeObject(sanpham3);
//
//            oos.close();
//            fos.close();
//
//        }catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //Object obj = null;
//        //đọc  file bawnfd objiectinout
//        FileInputStream fif = new FileInputStream("sanpham.txt");
//        ObjectInputStream ois= new ObjectInputStream(fif);
//        // đọc đối tượng ra
//        while (fif.available()>0)
//        {
//        sanpham obj =  (sanpham) ois.readObject();
//            System.out.println(obj);
//        }
//        ois.close();
//        fif.close();
//
//
//    }
//
//}
