package Exceptions.Movie;

public class InvalidMovieDataException extends RuntimeException {
    public InvalidMovieDataException(String message) {
        super(message);
    }
}
