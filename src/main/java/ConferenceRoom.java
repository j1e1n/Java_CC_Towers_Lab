import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guestList;
    private String name;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }


    public void addGuest(Guest guest) {
        this.guestList.add(guest);
    }

    public int getTotalGuests() {
       return this.guestList.size();
    }
}
