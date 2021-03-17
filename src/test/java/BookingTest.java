import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void before(){
        bedroom = new Bedroom(1408, 3, "Single", 50);
        booking = new Booking(bedroom, 3);

    }

    @Test
    public void canCalculateTotalBill (){
        assertEquals(150, booking.calculateTotalBill());
    }

}
