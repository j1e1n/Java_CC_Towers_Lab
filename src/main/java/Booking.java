import java.util.ArrayList;

public class Booking {

    private Bedroom bedroom;
    private int nights;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public int calculateTotalBill(){
        return this.nights * this.bedroom.getRate();
    }
}
