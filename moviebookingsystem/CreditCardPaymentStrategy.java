package moviebookingsystem;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override 
    public PaymentStatus pay(double amount)
    {
        // intergate credit card end point
        return PaymentStatus.SUCCESS;
    }
}
