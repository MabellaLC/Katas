package Exceptions;

public class UnknownCommandEx extends RuntimeException {
    public UnknownCommandEx(String message){
        super(message);
    }
}
