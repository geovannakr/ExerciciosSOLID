package solucao04;

class PushNotifier implements PushSender {
    @Override
    public void sendPush(String deviceToken, String msg) {
        System.out.println("Sending Push to " + deviceToken + ": " + msg);
    }
}