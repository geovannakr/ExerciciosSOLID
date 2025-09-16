package solucao07;

class RealPaymentGateway implements PaymentProcessor {
    public PaymentResult charge(double amount){
        return new PaymentResult(true, "AUTH: " + System.currentTimeMillis());
    }    
}
