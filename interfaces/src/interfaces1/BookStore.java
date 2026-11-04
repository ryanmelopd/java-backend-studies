package interfaces1;

public class BookStore {
    private DiscountPolicy discountPolicy;

    public BookStore(DiscountPolicy discountPolicy) { // injeção de dependência
        this.discountPolicy = discountPolicy;
    }

    public double finalPrice(double price) {
        return discountPolicy.applyDiscount(price);
    }
}