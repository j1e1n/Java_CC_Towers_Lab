import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom(1234, 3, "Double", 50);
        guest1 = new Guest("Bob");
    }


    @Test
    public void bedroomHasRoomNumber(){
        assertEquals(1234, bedroom.getRoomNumber());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getTotalGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.getTotalGuests());
    }
}
