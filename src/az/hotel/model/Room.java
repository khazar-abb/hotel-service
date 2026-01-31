package az.hotel.model;

public class Room {
    private int roomNumber;
    private String type;
    private double price;
    private boolean available;

    public Room(int roomNumber, String type, double price, boolean available){
        this.roomNumber = roomNumber;
        this.type = type;
        this. price = price;
        this.available = available;
    }

    public void printInfo(){
        System.out.println(roomNumber + " - " + type + " - " + price + " - " + available);
    }

    public boolean isAvailable(){
        return available;
    }

    public void reserve(){
        if (isAvailable()){
            available = false;
            System.out.println("Room number " + roomNumber + " reserved successfully");
        } else {
            System.out.println("Room number " + roomNumber + " NOT available");
        }
    }
}