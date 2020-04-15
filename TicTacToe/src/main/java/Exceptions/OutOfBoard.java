package Exceptions;

public class OutOfBoard extends RuntimeException {
    public OutOfBoard(String message){
        super(message);
    }
}
