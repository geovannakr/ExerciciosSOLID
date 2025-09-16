package solucao07;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor normal = new RealPaymentGateway();
        PaymentProcessor deGratis = new FreeTrialProcessor();

        System.out.println("Pagamento normal: " + normal.charge(100.00));
        System.out.println("Pagamento de grátis: " + deGratis.charge(100.00));

    }
}
