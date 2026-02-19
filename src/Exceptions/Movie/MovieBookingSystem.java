package Exceptions.Movie;

public class MovieBookingSystem {
    private final double PRICE = 5.0;
    private double balance;

    public void bookTickets(int ticketCount) throws InvalidTicketAmountException {
        if (ticketCount <= 0) {
            throw new InvalidTicketAmountException(" Invalid Ticket Amount Exception.");
        } else {
            balance += PRICE * ticketCount;
            System.out.println(ticketCount + " ticket(s) booked - Current balance: " + balance);
        }
    }

    public void processPayment(double paymentAmount, int ticketCount) throws InvalidPaymentAmountException {
        double totalPrice = ticketCount * PRICE;
        if (paymentAmount < totalPrice) {
            throw new InvalidPaymentAmountException("Invalid Ticket Amount Exception.");
        } else {
            balance += totalPrice;
            System.out.println(totalPrice + " paid. " + ticketCount + " ticket(s) booked - Current balance: " + balance );
        }
    }

    public void confirmBooking(String movieName){
        if (movieName == null){
            throw new NullMovieNameException("Null MOVIE NAME Exception");
        }
        if (movieName.isEmpty()){
            throw new InvalidMovieDataException("Invalid MOVIE DATA Exception");
        }
        System.out.println("Moive: " + movieName + " successfully booked.");
    }
}