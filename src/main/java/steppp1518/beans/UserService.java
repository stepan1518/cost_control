package steppp1518.beans;

public interface UserService {
    void addUser(final User user);
    void deleteUser(final String email);
    void updateUser(final User user);
    User getUser(final String email);
}
