package interfaces1;

public class StudentDiscount implements DiscountPolicy {
    @Override
    public double discountRate() {
        return 20.0;
    }
}