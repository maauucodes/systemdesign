package moviebookingsystem;

public class PaymentStrategyFactory {
    public PaymentStrategy createPaymentStrategy(PaymentMethod method)
    {
        return switch(method){
            case PaymentMethod.UPI->new UPIPaymentStrategy();
            case PaymentMethod.CREDIT_CARD->new CreditCardPaymentStrategy();
            default->throw new IllegalArgumentException("This method of payment is not supported");
        };
    }
}
