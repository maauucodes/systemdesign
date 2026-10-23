package moviebookingsystem;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override 
    public boolean pay(double amount)
    {
        //integrate upi payment end points

        return true;
    }
}
