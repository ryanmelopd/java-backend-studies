package interfaces1;

public class NoDiscount implements DiscountPolicy {
    @Override
    public double discountRate() {
        return 0.0;
    }
}