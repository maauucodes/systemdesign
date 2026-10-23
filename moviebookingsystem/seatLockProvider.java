package moviebookingsystem;

import java.util.HashMap;
import java.util.Map;

public class seatLockProvider 
{
    private static final long LOCK_DURATION=5L;
    private Map<String, SeatLock> lockedShowSeats=new HashMap<>(); // key=showid+seatid 

    public synchronized boolean isLocked(String showId, String seatId)
    {
        String key=showId+" "+seatId;

        SeatLock lock=lockedShowSeats.get(key);

        if(lock==null)
        {
            return false;
        }
        if(isExpired(lock))
        {
            lockedShowSeats.remove(key);
            return false;
        }
        return true;
    }
    public synchronized void lock(String showId, String seatId, String userId)
    {
        String key=showId+" "+seatId;

        if(!isLocked(showId, seatId))
        {
            lockedShowSeats.put(key, new SeatLock(showId, userId, seatId, System.currentTimeMillis()+LOCK_DURATION));
        }
        throw new RuntimeException("This seat is not available");
    }
    public boolean isExpired(SeatLock lock)
    {
        if(lock.getExpiryTime()<System.currentTimeMillis()+LOCK_DURATION)
        {
            return true;
        }
        return false;
    }

}
