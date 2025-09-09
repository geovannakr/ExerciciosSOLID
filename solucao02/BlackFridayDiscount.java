package solucao02;

public class BlackFridayDiscount implements DiscountCalculator{
    public double applyDiscount(double amount) {
        return amount * (1 - 0.3);
    }
}
