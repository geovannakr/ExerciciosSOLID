package solucaoExercicio02;

public class VipDiscount implements DiscountCalculator {
    public double applyDiscount(double amount) {
        return amount * (1 - 0.2);
    }
}
