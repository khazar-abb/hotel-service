package az.hotel.service;

import az.hotel.model.Room;

public class HotelService {
    private Room[] hotelRooms = new Room[3];
    static int totalRooms;

    public void addRoom(Room room){
        for (int i = 0; i < hotelRooms.length; i++){
            hotelRooms[i] = room;
            totalRooms++;
        }
    }

    public void listAvailableRooms(){
        System.out.println("Total rooms -> " + totalRooms);
        for (int i = 0; i < hotelRooms.length; i++) {
            if (hotelRooms[i] != null){
                if (hotelRooms[i].isAvailable()) {
                    System.out.println(hotelRooms[i] + " is Available");
                } else {
                    System.out.println(hotelRooms[i] + " is Reserved");
                }
            }
        }
    }
}