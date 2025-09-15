package solucao05;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new MySqlUserRepository();
        EmailService emailService = new SmtpEmailService();

        UserController userController = new UserController(userRepository, emailService);

        User user = new User("krugergeovanna4@gmail.com");

        userController.register(user);

    }
    
}
