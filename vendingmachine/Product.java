package vendingmachine;

import java.math.BigDecimal;

public class Product {
    public String name;
    public BigDecimal price;

    public Product(String name, BigDecimal price)
    {
        this.name=name;
        this.price=price;
    }

    public String getProductName()
    {
        return name;
    }
    public BigDecimal getProductPrice()
    {
        return price;
    }
}
