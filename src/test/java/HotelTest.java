import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;
    private Guest guest2;
    private DiningRoom diningRoom1;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1234, 3, "Double", 75);
        conferenceRoom1 = new ConferenceRoom(20, " C Room 1");
        guest1 = new Guest("Bob");
        guest2 = new Guest("Melinda");
        diningRoom1 = new DiningRoom("DR1");
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

    @Test
    public void canRemoveGuestFromBedroom() {
        hotel.addGuestToBedroom(guest1, bedroom1);
        hotel.removeGuestFromBedroom(guest1, bedroom1);
        assertEquals(0, bedroom1.getTotalGuests());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom(){
        hotel.addGuestToConferenceRoom(guest2, conferenceRoom1);
        hotel.removeGuestFromConferenceRoom(guest2, conferenceRoom1);
        assertEquals(0, conferenceRoom1.getTotalGuests());
    }

    @Test
    public void canCreateBooking(){
        Booking booking = hotel.bookRoom(bedroom1, 3);
        assertEquals(225, booking.calculateTotalBill());
    }


    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom1);
        assertEquals(1, hotel.getNumberOfDiningRooms());
    }


}




