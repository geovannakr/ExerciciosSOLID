package solucao02;

public class Main {
        public static void main(String[] args) {
            DiscountCalculator VipDiscountCalculator = new VipDiscount();
            DiscountCalculator CouPonDiscountCalculator= new CouPonDiscount();
            DiscountCalculator BlackFridayDiscountCalculator = new BlackFridayDiscount();
    
            double amount = 100.0;
            System.out.println("VIP: " + VipDiscountCalculator.applyDiscount(amount));
            System.out.println("COUPON10: " + CouPonDiscountCalculator.applyDiscount(amount));
            System.out.println("BLACK FRIDAY: " + BlackFridayDiscountCalculator.applyDiscount(amount));
        } 
    }