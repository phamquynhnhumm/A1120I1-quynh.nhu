package _bai19_String_Regex._Thuc_hanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static ValidateEmail validateEmail;
    public static final String[] valiEmail = new String[]{"a@gmail.com", "abllyahoo.com", "abc@hotmail.com"};
  Scanner nhapchuoi = new Scanner(System.in);
  String chuoi = nhapchuoi.nextLine();
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String IDKHACH = "[0-9]{3} [0-9]{3} [0-9]{3}";
    public ValidateEmail() {
        pattern= Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex)
    {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for(String email : valiEmail)
        {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("emial :" + isvalid);
        }
    }
}
