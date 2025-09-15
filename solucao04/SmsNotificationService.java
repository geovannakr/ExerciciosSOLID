package solucao04;

public class SmsNotificationService {
        private final SmsSender smsSender;
    
        public SmsNotificationService(SmsSender smsSender) {
            this.smsSender = smsSender;
        }
    
        public void notifyUser(String phone, String message) {
            smsSender.sendSms(phone, message);
        }
    }
