package steppp1518.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import steppp1518.database.Client;

public interface UserService extends UserDetailsService {
    boolean addUser(final Client client);

    void deleteUser(final String email);

    Client findUser(final String email);
}
