package vendingmachine;

import java.math.BigDecimal;

public interface PaymentService {
    public PaymentStatus pay(BigDecimal amount);
}
