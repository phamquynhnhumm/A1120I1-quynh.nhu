package _bai17_BinaryFILe_Serialization._Baitap;

import sun.security.mscapi.CPublicKey;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class quan_ly_san_pham {
    public static final String FILE = "D:\\A112011PhamThiQuynhNhu\\Module02\\src\\_bai17_BinaryFILe_Serialization\\file\\sanpham.txt";

    public static void writeSP(sanpham sanphamsk)  throws IOException {
        File file = new File(FILE);
        FileWriter fileWriter = null;
        BufferedWriter buffdWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            buffdWriter = new BufferedWriter(fileWriter);
            buffdWriter.write(sanphamsk.getMaSp() + "," + sanphamsk.getTenSP() + "," + sanphamsk.getHangSP() + "," + sanphamsk.getGia() + "," + sanphamsk.getMotakhach() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffdWriter != null) {
                    buffdWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<sanpham> readCSV() throws IOException {
        List<sanpham> sanphamList = new ArrayList<>();
        File file = new File(FILE);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(fileReader);
            String line;
            sanpham sanphams;
            String[] tam;
            while ((line = buffered.readLine()) != null && !line.isEmpty()) {
                tam = line.split(",");
                sanphams = new sanpham(tam[0], tam[1], tam[2], Integer.parseInt(tam[3]), tam[4]);
                sanphamList.add(sanphams);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sanphamList;

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        System.out.println("Menu :\n" +
                "1. Th??m s???n ph???m\n" +
                "2. Hi???n th??? s???n ph???m\n" +
                "3. T??m ki???m s???n ph???m\n" +
                "Nh???p v??o yc b???n mu???n\n" + ""
        );

        System.out.println("Nh???p v??o s??? s???n ph???m b???n mu???n th??m:");
        Scanner nhapn = new Scanner(System.in);
        Scanner nhapmasp = new Scanner(System.in);
        Scanner nhaptensp = new Scanner(System.in);
        Scanner nhaphangsp = new Scanner(System.in);
        Scanner nhapgiasp = new Scanner(System.in);
        Scanner nhaomotakhac = new Scanner(System.in);
        int n = nhapn.nextInt();
        sanpham sanpham = null;

        LinkedList<sanpham> sanphams = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("s???n ph???m th???  " + i);
            System.out.println("M?? sp :");
            String masp = nhapmasp.nextLine();
            System.out.println("T??n sp :");
            String tensp = nhaptensp.nextLine();
            System.out.println("H??ng sp :");
            String hangso = nhaphangsp.nextLine();
            System.out.println("Gi?? sp");
            int giasp = nhapgiasp.nextInt();
            System.out.println("M?? t??? kh??c :");
            String motakhac = nhaomotakhac.nextLine();
            sanpham = new sanpham(masp, tensp, hangso, giasp, motakhac);
            sanphams.add(sanpham);
        }
        for (sanpham sanpham1 : sanphams) {
            writeSP(sanpham1);
            readCSV();
        }
    }
}




