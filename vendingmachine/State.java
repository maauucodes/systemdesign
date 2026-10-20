package vendingmachine;

public interface State {
    public void selectItem(VendingMachine machine, Product item);
    public PaymentStatus processPayment(VendingMachine machine);
    public void dispenseItems(VendingMachine machine);
}
