package steppp1518.beans;

import java.util.List;

public interface UserService {
    void addUser(final User user);
    void deleteUser(final String email);
    void updateUser(final User user);
    User getUser(final String email);
    List<Waste> getWastes(final String email);
    void addWaste(final Waste waste);
}
