package moviebookingsystem;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override 
    public PaymentStatus pay(double amount)
    {
        // intergate upi end point
        return PaymentStatus.SUCCESS;
    }
}
