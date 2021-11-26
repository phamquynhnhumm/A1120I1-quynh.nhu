package _bai19_String_Regex._Thuc_hanh;

public class EmailExampleTest {
    private static ValidateEmail validateEmail;
    public static final String[] valiEmail = new String[]{"a@gmail.com", "abllyahoo.com", "abc@hotmail.com"};
    public static final String[] invaliEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for(String email : valiEmail)
        {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("emial :" + isvalid);
        }
        for (String email :invaliEmail) {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }

    }
}
