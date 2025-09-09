package solucaoExercicio02;

public class CouPonDiscount implements DiscountCalculator{
    public double applyDiscount(double amount) {
        return amount * (1 - 0.1);
    }
}
