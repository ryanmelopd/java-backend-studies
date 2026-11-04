package interfaces1;

public interface DiscountPolicy {
    double discountRate(); // abstrato: cada política define a sua taxa
    default double applyDiscount(double price) {
        return price - (price * discountRate() / 100.0);
    }
}