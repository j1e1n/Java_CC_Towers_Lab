import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guestList;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return roomType;
    }



    public int getTotalGuests() {
       return this.guestList.size();
    }

    public void addGuest(Guest guest) {
        this.guestList.add(guest);
    }

    public void removeGuest(Guest guest) { this.guestList.remove(guest); }
    }

