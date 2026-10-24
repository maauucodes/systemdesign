package moviebookingsystem;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class SeatLockProvider {
    private Map<String, ReentrantLock> reentrantLockStore=new ConcurrentHashMap<>();
    private Map<String, SeatLock> seatLockStore=new ConcurrentHashMap<>();

    public void lock(String seatId, String userId, String showId)
    {
        String key=seatId+" "+showId;
        ReentrantLock lock=reentrantLockStore.computeIfAbsent(key, id->new ReentrantLock());

        long currentTime=System.currentTimeMillis();

        lock.lock();
        try
       { if(isLocked(key))
        {
            throw new RuntimeException("This seat in the show is alreadyblocked");
        }
        seatLockStore.computeIfAbsent(key, id->new SeatLock(seatId, userId, showId,currentTime+5L));}
        finally{
            lock.unlock();
        }
}

    public boolean isLocked(String key)
    {
        ReentrantLock lock=reentrantLockStore.computeIfAbsent(key, id->new ReentrantLock());

        lock.lock();
        try{
            SeatLock seatLock=seatLockStore.get(key);
            if(isExpired(seatLock))
            {
                seatLockStore.remove(key);
                return false;
            }
            else{
                return true;
            }
        }
        finally
        {lock.unlock();}
    }
    public ReentrantLock getLock(String key)
    {
        return reentrantLockStore.computeIfAbsent(key, lock->new ReentrantLock());
    }
    public boolean isExpired(SeatLock seatLock)
    {
        long currentTime=System.currentTimeMillis();

        return seatLock.getExpiryTime()<currentTime;
    }
}
