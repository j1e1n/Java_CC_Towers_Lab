import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1234, 3, "Double");
    }


    @Test
    public void bedroomHasRoomNumber(){
        assertEquals(1234, bedroom.getRoomNumber());
    }

}
