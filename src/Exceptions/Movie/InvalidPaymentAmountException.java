package Exceptions.Movie;

public class InvalidPaymentAmountException extends Exception {
    public InvalidPaymentAmountException(String message) {
        super(message);
    }
}
