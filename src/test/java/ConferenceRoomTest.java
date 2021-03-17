import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest2;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20, "Conference Room 1");
        guest2 = new Guest("Melinda");
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Conference Room 1", conferenceRoom.getName());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest2);
        assertEquals(1, conferenceRoom.getTotalGuests());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest2);
        assertEquals(0, conferenceRoom.getTotalGuests());
    }

}
