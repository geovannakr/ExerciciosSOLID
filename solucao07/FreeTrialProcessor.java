package solucao07;

class FreeTrialProcessor implements PaymentProcessor{
    public PaymentResult charge(double amount){
        return new PaymentResult(true, null);
    }
}
