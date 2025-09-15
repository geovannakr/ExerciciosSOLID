package solucao05;

class SmtpEmailService implements EmailService{
    @Override
    public void sendWelcome(String email){
        System.out.println("Sending welcome to " + email);
    }
}
