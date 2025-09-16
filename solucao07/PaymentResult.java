package solucao07;

 class PaymentResult {
    boolean sucess;
    String authCode;

    public PaymentResult(boolean success, String authCode){
        this.sucess = success;
        this.authCode = authCode;
    }

    public String toString(){
        return "sucess: " + sucess + " || AuthCode: " + authCode;
    }
    
}
