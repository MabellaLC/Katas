package Exceptions;

public class PlayerNotValid extends RuntimeException {
    public PlayerNotValid(String message){
        super(message);
    }
}
