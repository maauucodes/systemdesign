package moviebookingsystem;

public class SeatLock {
    private String seatId;
    private String showId;
    private String userId;
    private long expiryTime;

    SeatLock(String seatId, String userId, String showId, long expiryTime)
    {
        this.seatId=seatId;
        this.showId=showId;
        this.userId=userId;
        this.expiryTime=expiryTime;
    }

    public long getExpiryTime()
    {
        return expiryTime;
    }
    public String getShowId()
    {
        return showId;
    }
    public String getSeatId()
    {
        return seatId;
    }
    public String getUserId()
    {
        return userId;
    }
}
