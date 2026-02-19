package Exceptions.Movie;

public class NullMovieNameException extends RuntimeException {
    public NullMovieNameException(String message) {
        super(message);
    }
}
