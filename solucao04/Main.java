package solucao04;

public class Main {
        public static void main(String[] args) {
            SmsSender smsSender = new SmsOnlyNotifier();
            SmsNotificationService smsService = new SmsNotificationService(smsSender);
            smsService.notifyUser("+5511999999999", "Seu código é 123456");
    
            EmailSender emailSender = new EmailNotifier();
            PushSender pushSender = new PushNotifier();
    
            MultiChannelNotificationService multiChannelService =
                    new MultiChannelNotificationService(emailSender, pushSender);
    
            multiChannelService.notifyByEmail("cliente@exemplo.com", "Boas-vindas", "Obrigado por se cadastrar!");
            multiChannelService.notifyByPush("device_token_abc123", "Você tem uma nova mensagem!");
        }
    }