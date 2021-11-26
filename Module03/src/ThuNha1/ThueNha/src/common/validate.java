package common;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class validate {

    private static final String ID_NV = "[A-Z0-9]{3}[-][A-Z0-9]{2}[-][A-Z0-9]{2}";

    public static long dateIf(String ngaybatdau, String ngaykethuc){
        DateFormat kieungay = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaybd=null;
        Date ngaykt=null;
        try {
            ngaybd=kieungay.parse(ngaybatdau);
            System.out.println(ngaybd);

            ngaykt=kieungay.parse(ngaykethuc);
            System.out.println(ngaykt);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        long miliseconds=ngaykt.getTime() - ngaybd.getTime();
        long days=miliseconds/(24 * 60 * 60 * 1000);
        return days;
    }

    public static String ID(String value) {
        String message = null;
        if (!Pattern.matches(ID_NV, value)) {
            message = "vui lòng nhập đúng định dạng XXX-XX-XX";
        } else {
            message = null;
        }
        return message;
    }
}

