import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }


    public void addGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }


    public void removeGuestFromBedroom(Guest guest, Bedroom bedroom) { bedroom.removeGuest(guest); }

    public void addGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) { conferenceRoom.addGuest(guest); }

    public void removeGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) { conferenceRoom.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
        return new Booking(bedroom, nights);
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public int getNumberOfDiningRooms(){
       return this.diningRooms.size();
    }





}

