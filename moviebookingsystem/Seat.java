package moviebookingsystem;

public class Seat {
    private String seatId;
    private double price;
    private SeatType type;

    Seat(String seatId, double price, SeatType type)
    {
        this.seatId=seatId;
        this.price=price;
        this.type=type;
    }

    public SeatType getSeatType()
    {
        return type;
    }
    public double getSeatPrice()
    {
        return price;
    }
    public void setSeatPrice(double price)
    {
        this.price=price;
    }
}
