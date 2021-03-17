import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Dining Room 1");
    }

    @Test
    public void diningRoomHasName(){
        assertEquals("Dining Room 1", diningRoom.getName());
    }

}
