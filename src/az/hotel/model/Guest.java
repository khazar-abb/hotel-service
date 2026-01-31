package az.hotel.model;

public class Guest {
    private int id;
    private String name;
    private Room[] reservedRooms = new Room[2];

    public Guest(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void reserveRoom(Room room){
        for (int i = 0; i < reservedRooms.length; i++) {
            if (reservedRooms[i] == null) {
                    reservedRooms[i] = room;
                    room.reserve();  //room reserved
            }
        }
    }

    public void printReservedRooms(){
        for (int i = 0; i < reservedRooms.length; i++){
            if (reservedRooms[i] != null) {
                System.out.println(reservedRooms[i] + " Reserved by " + name);
            }
        }
    }
}