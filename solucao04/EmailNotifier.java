package solucao04;

    class EmailNotifier implements EmailSender {
        @Override
        public void sendEmail(String to, String subject, String body) {
            System.out.println("Sending Email to " + to + ": " + subject);
        }
    }