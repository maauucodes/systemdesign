package moviebookingsystem;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MovieBookingService 
{
    private SeatLockProvider seatLockProvider;
    private PaymentServiceFactory paymentStrategyFactory;
    private Map<String,Booking> bookedShowSeats=new ConcurrentHashMap<>();

    public Booking bookSeat(String userId, String showId, String seatId, double amount)
    {
        String key=showId+" "+seatId;
        if(bookedShowSeats.containsKey(key))
        {
            return null;
        }
        try{
            seatLockProvider.lock(seatId, userId, showId);
            Booking booking=new Booking(userId, showId, seatId, amount);
            return booking;
        }catch(RuntimeException e){
            System.out.println("The seat is not available");
            return null;
        }
    }
    public void pay(String key, Booking booking, PaymentMethod method)
    {
        if(!seatLockProvider.isLocked(key))
        {PaymentStrategy paymentMethod=paymentStrategyFactory.createPaymentStrategy(method);
        paymentMethod.pay(booking.getBookingAmount());
        booking.updateStatus(BookingStatus.CONFIRMED);
        bookedShowSeats.computeIfAbsent(key,id->booking);}
        else
        {
            throw new RuntimeException("The seat you chose is already booked");
        }
    }
}
