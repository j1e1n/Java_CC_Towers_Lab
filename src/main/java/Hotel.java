import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;



    public void addGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }


    public void removeGuestFromBedroom(Guest guest, Bedroom bedroom) { bedroom.removeGuest(guest); }

    public void addGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) { conferenceRoom.addGuest(guest); }

    public void removeGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) { conferenceRoom.removeGuest(guest);
    }
}
