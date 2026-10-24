package moviebookingsystem;

public class PaymentServiceFactory {
    public PaymentStrategy createPaymentStrategy(PaymentMethod method)
    {
        return switch(method){
            case PaymentMethod.UPI->new UPIPaymentStrategy();
            case PaymentMethod.CREDIT_CARD->new CreditCardPaymentStrategy();
            default->throw new RuntimeException("The selected method does not exist");
        };
    }
}
