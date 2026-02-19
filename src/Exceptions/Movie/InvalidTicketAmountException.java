package Exceptions.Movie;

public class InvalidTicketAmountException extends Exception {
    public InvalidTicketAmountException(String message) {
        super(message);
    }
}
