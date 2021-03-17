import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1234, 3, "Double");
        conferenceRoom1 = new ConferenceRoom(20, " C Room 1");
        guest1 = new Guest("Bob");
        guest2 = new Guest("Melinda");
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addGuestToBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.getTotalGuests());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom1.addGuest(guest2);
        assertEquals(1, conferenceRoom1.getTotalGuests());
    }



}
