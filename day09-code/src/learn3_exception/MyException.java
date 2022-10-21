package learn3_exception;

public class MyException extends RuntimeException{
    static final long serialVersionUID=-7034897190745966939L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
