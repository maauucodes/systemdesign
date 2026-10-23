package moviebookingsystem;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override 
    public boolean pay(double amount)
    {
        //integrate credit card payment end points

        return true;
    }
}