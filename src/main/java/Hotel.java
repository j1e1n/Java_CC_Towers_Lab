import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;



    public void addGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }


}
