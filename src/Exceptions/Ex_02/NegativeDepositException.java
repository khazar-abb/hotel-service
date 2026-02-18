package Exceptions.Ex_02;

public class NegativeDepositException extends RuntimeException {
    public NegativeDepositException(String message) {
        super(message);
    }
}
