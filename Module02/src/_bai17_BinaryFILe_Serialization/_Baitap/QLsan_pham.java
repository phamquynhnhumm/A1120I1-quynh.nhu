//package _bai17_BinaryFILe_Serialization._Baitap;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//public class QLsan_pham {
//    public static void main(String[] args) throws FileNotFoundException {
//        sanpham  sanpham1= new sanpham("3wsgs", "Sữa rửa mặt",   "nihongo",567.8,"do dễ vỡ" );
//        /*  ghi file*/
//        try
//        {
//            FileOutputStream fos = new FileOutputStream("sanpham.txt");
//            ObjectOutputStream oos= new ObjectOutputStream(fos);
//            oos.writeObject(sanpham1);
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
//
//    }
//
//}
