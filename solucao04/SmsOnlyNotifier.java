package solucao04;

class SmsOnlyNotifier implements SmsSender {
    @Override
    public void sendSms(String phone, String text) {
        System.out.println("Sending SMS to " + phone + ": " + text);
    }
}

