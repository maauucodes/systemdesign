package moviebookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private String screenId;
    private List<Seat> seats;

    Screen(String screenId, List<Seat> seats)
    {
        this.screenId=screenId;
        this.seats=seats;
    }

    public List<Seat> getSeats()
    {
        return List.copyOf(seats);
    }
    public void addSeat(Seat seat)
    {
        seats.add(seat);
    }
}
