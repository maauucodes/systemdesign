package moviebookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private String userId;
    private Show show;
    private double amount;
    private List<Seat> seats=new ArrayList<>();

   Booking(String userId, Show show, double amount, List<Seat> seats)
   {
      this.userId=userId;
      this.show=show;
      this.amount=amount;
      this.seats=seats;
   }

   //getters
}
