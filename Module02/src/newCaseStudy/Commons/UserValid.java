package newCaseStudy.Commons;

import newCaseStudy.exception.*;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValid {
    private static final String NAME_REGEX ="^([A-Z][a-z]+ )*";
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String ID_CARD_REGEX = "^\\d{3}\\s\\d{3}\\s\\d{3}$";
    private static final String DATE_BIRTH_REGEX ="^\\d{2}\\/\\d{2}\\/\\d{4}$";
    private static final String PHONE_REGEX ="\\d*";
    private static Scanner scanner = new Scanner(System.in);
    private static Pattern pattern;
    private Matcher matcher;

    public boolean validName(String name) throws NameException {
        pattern = Pattern.compile(NAME_REGEX);
        matcher=pattern.matcher(name+" ");
        if(!matcher.matches()){
            throw new NameException("First character must be uppercase format and no extra space characters are allowed\n Please try again!");
        }
        else{
            return true;
        }

    };
    public boolean validMail(String mail) throws EmailException {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher=pattern.matcher(mail);
        if(!matcher.matches()){
            throw new EmailException("Email must be in the correct format abc@abc.abc \n Please try again!");
        }
        else{
            return true;
        }
    };
    public int validGender(String gender) throws GenderException {
        // return -1->false ; return 0 ->Male ; return 1-Fema qle ; return 2 Unknow
        gender =gender.toLowerCase();
        switch (gender){
            case "male":
                return 0;
            case "female":
                return 1;
            case "unknown":
                return 2;
            default:
                throw new GenderException("Gender must be Male, FeMale or Unknow");
        }
    }
    public boolean validIdCard(String idCard) throws IdCardException {
        pattern = Pattern.compile(ID_CARD_REGEX);
        matcher=pattern.matcher(idCard);
        if(!matcher.matches()){
            throw new IdCardException("Id Card must be in correct with 9 number XXX XXX XXX\n Please try again!");
        }
        else{
            return true;
        }

    }
    public boolean validBirthday(String birthday) throws BirthdayException {
        pattern = Pattern.compile(DATE_BIRTH_REGEX);
        matcher=pattern.matcher(birthday);
        if(!matcher.matches()){
            throw new BirthdayException("Errorr birthday");
        }else{
            int year = Calendar.getInstance().get(Calendar.YEAR);
            if (year - Integer.parseInt(birthday.substring(6, 10)) > 18 &&Integer.parseInt(birthday.substring(6, 10))>1900){
                return true;
            }else {
                throw new BirthdayException("Year must be greater than 1900 and age greater than 18 ");
            }
        }
    }
    public boolean validPhoneNumber(String phone) throws PhoneException {
        pattern = Pattern.compile(PHONE_REGEX);
        matcher=pattern.matcher(phone);
        if(!matcher.matches()){
            throw new PhoneException("Phone must be number \n Please try again!");
        }
        else{
            return true;
        }
    }

//    public static int inputArea()  {
//        int area;
//        while (true){
//            try {
//                area = scanner.nextInt() ;
//                throw new UserException("Lỗi định dạng tên nhập vào sao");
//            } catch (UserException e) {
//                e.printStackTrace();
//            }
//            if (area > 12){
//                    return area;
//                }else {
//                    System.out.println("loi");
//                    System.out.println("loi");
//
//                }
//        }
//    }
}
