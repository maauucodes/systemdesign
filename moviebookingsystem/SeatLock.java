package moviebookingsystem;

public class SeatLock {
    private String showId;
    private String userId;
    private String seatId;
    private long expiryTime;

    SeatLock(String showId, String userId, String seatId, long expiryTime)
    {
        this.seatId=seatId;
        this.userId=userId;
        this.showId=showId;
        this.expiryTime=expiryTime;
    }

    //getters
}
