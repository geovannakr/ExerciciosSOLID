package solucao05;

 class UserController {
    private final UserRepository repo;
    private final EmailService email;

    public UserController(UserRepository repo, EmailService email){
        this.repo = repo;
        this.email = email;
    }

    public void register(User u){
        repo.save(u);
        email.sendWelcome(u.getEmail());
    }
    
}
