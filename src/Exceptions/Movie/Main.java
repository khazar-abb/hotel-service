package Exceptions.Movie;

public class Main {
    static void main(String[] args) {

        MovieBookingSystem system = new MovieBookingSystem();

        try {
            system.bookTickets(-3);
        } catch (InvalidTicketAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            system.bookTickets(3);
        } catch (InvalidTicketAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            system.processPayment(1, 2);
        } catch (InvalidPaymentAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            system.processPayment(35,6);
        } catch (InvalidPaymentAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            system.confirmBooking(null);
        } catch (NullMovieNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMovieDataException es){
            System.out.println(es.getCause());
        }

        try {
            system.confirmBooking("");
        } catch (NullMovieNameException | InvalidMovieDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            system.confirmBooking("The Sea Inside");
        } catch (NullMovieNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMovieDataException es){
            System.out.println(es.getCause());
        }

    }
}