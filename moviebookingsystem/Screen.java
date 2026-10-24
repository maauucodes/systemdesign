package moviebookingsystem;

import java.util.List;

public class Screen {
    private String screenId;
    private List<Seat> seats;

    Screen(String screenId, List<Seat> seats)
    {
        this.screenId=screenId;
        this.seats=seats;
    }

    public String getId()
    {
        return screenId;
    }
    public List<Seat> getSeats()
    {
        return List.copyOf(seats);
    }
}
