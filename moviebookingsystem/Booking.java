package moviebookingsystem;

public class Booking {
    private String showId;
    private String seatId;
    private String userId;
    private BookingStatus status;
    private double bookingAmount;

    Booking(String userId, String showId, String seatId, double bookingAmount)
    {
        this.userId=userId;
        this.showId=showId;
        this.seatId=seatId;
        this.status=BookingStatus.PENDING_CONFIRMATION;
        this.bookingAmount=bookingAmount;
    }

    public double getBookingAmount()
    {
        return bookingAmount;
    }
    public void updateStatus(BookingStatus status)
    {
        this.status=status;
    }
}
