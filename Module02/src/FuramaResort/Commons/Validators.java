package FuramaResort.Commons;

import FuramaResort.exception.EmailException;
import FuramaResort.exception.GenderException;
import FuramaResort.exception.NameException;

import java.lang.reflect.Array;
import java.net.BindException;
import java.time.Year;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {
    public static final String CODE = "[A-Z][a-z]*";
    private static Pattern pattern;
    private static Matcher matcher;
    public static  final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static final String IDKHACH = "[\\d]{3} [\\d]{3} [\\d]{3}";
    public static final String DICVU = "(massage|karaoke|food|drink|car";
    public static final String NGAYSINH = "[\\d]{2}/[\\d]{2}/[\\d]{4}";
    public static boolean isValidService(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
        }
        return flag;
    }


    public static boolean isDienTich(double number, double number2) {
        boolean flag = number2 < number;
        if (!flag) {
            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
        }
        return flag;
    }

    public static boolean isSoNguoi(double number, double number2, double number3) {
        boolean flag = number2 < number && number < number3;
        if (!flag) {
            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
        }
        return flag;
    }

    public static boolean isChiPhi(double number, double number2) {
        boolean flag = number2 < number;
        if (!flag) {
            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
        }
        return flag;
    }


    public static boolean isDichVu(String str, String regexdv) {
        pattern = Pattern.compile(regexdv);
        matcher = pattern.matcher(str);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
        }
        return flag;
    }
    public static boolean isEMAIL(String str, String regexdv) {
        pattern = Pattern.compile(regexdv);
        matcher = pattern.matcher(str);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
        }
        return flag;
    }


    public static boolean isTang(double number, double number2) {
        boolean flag = number > number2;
        if (!flag) {
            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
        }
        return flag;
    }

    public static void isTenKh(String name) throws NameException {
        String[] fullName = name.split(" ");
        // ếu ko phải chữ thường
        for (String element : fullName) {
            if (Character.isLowerCase(element.charAt(0))) {
                throw new NameException();
            }
        }
        // tránh thừa khoảng thắng
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) == ' ' && name.charAt(i + 1) == ' ') {
                throw new NameException();
            }
        }
    }
    public  static void isEmail(String email) throws EmailException {
        int posA = email.indexOf("@");
        int posPoin = email.indexOf(".");
        if(   posA<=0 || posA >=2)
        {
            throw new EmailException();
        }
        int countA = 0;
         int countPoint =0;
          for( int i  =0 ;i <email.length(); i++)

          {
              if(email.charAt(i) =='@')
              {countA ++;
              }
              else if(email.charAt(i) =='.')
              {
                  countPoint ++;
              }
          }
          if(countA >=2)
          {
              throw new EmailException();
          }

        if(countPoint ==0)
        {
            throw new EmailException();
        }



    }
    public static  void  isGioiTinh(String gioitinh) throws GenderException {
        String[] list = {"nam","nu","thu3"};
         // nếu list ko chứ gioi tinh cho viết thường
        if(!Arrays.asList(list).contains(gioitinh.toLowerCase())){
            throw  new GenderException();
        }
    }

    public static boolean isIDKHACH(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
        }
        return flag;
    }
    public  static void isNgaySinh(String isngaysinh) throws BindException {
       if(isValidService(isngaysinh,NGAYSINH )) {
           int birthYear = Integer.parseInt(isngaysinh.split("/")[2]);
           int curYear = Year.now().getValue(); // lấy năm năm hiện tại
           if(birthYear <= 1900 ||curYear  - birthYear  <18)
           { throw new BindException();
           }
       }
       else
           throw new BindException();
    }

//    public static boolean isDichVu(String extra) {
//      String[] list = {"masse","karaoke","foood","drink","car"};
//        boolean flag =  Array.asList(list).contains(extra);
//        if (!flag) {
//            System.out.println(" Bạn hãy nhập lại cho đúng định dang");
//        }
//        return  flag;
//    }


}

