package moviebookingsystem;

public interface PaymentStrategy {
    public PaymentStatus pay(double amount);
}
