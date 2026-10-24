package moviebookingsystem;

public class Seat {
    private String seatId;
    private Type seatType;
    private double seatPrice;

    Seat(String seatId, Type seatType, double seatPrice)
    {
        this.seatId=seatId;
        this.seatType=seatType;
        this.seatPrice=seatPrice;
    }

    public String getId()
    {
        return seatId;
    }
    public Type getType()
    {
        return seatType;
    }
    public double getPrice()
    {
        return seatPrice;
    }
}
