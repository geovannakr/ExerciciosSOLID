package solucao04;

public class MultiChannelNotificationService  {
    private final EmailSender emailSender;
    private final PushSender pushSender;

    public MultiChannelNotificationService(EmailSender emailSender, PushSender pushSender) {
        this.emailSender = emailSender;
        this.pushSender = pushSender;
    }

    public void notifyByEmail(String to, String subject, String body) {
        emailSender.sendEmail(to, subject, body);
    }

    public void notifyByPush(String deviceToken, String message) {
        pushSender.sendPush(deviceToken, message);
    }
}
