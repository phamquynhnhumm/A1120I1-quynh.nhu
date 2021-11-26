package FuramaResort.exception;

public class BirthdayException extends Exception {
    public  BirthdayException()
    {
        super("Năm sinh phải lớn hơn 1900 và nhỏ hơn 2021 và" +
                "đúng định dang xx/yy/zzzz ");
    }
}
