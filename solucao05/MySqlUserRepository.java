package solucao05;

class MySqlUserRepository implements UserRepository {
    @Override
    public void save(User u) {
        System.out.println("Saving user " + u.getEmail() + " to MySQL");
    }
}
