import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guestList;
    private String roomType;
    private int rates;

    public Bedroom(int roomNumber, int capacity, String roomType, int rates) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
        this.roomType = roomType;
        this.rates = rates;
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

    public int getRate() {
        return this.rates;
    }
}

