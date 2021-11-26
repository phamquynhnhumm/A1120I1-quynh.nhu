package _15_exception;

public class IdCheckingException extends Exception{
    public IdCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "co loi nhap id:" + super.getMessage();
    }
}
