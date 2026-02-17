package Exceptions.Ex_01;

public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}
