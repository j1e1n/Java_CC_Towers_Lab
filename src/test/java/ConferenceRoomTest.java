import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20, "Conference Room 1");
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Conference Room 1", conferenceRoom.getName());
    }

}
