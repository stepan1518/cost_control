package steppp1518.service;

import steppp1518.database.Client;

public interface UserService {
    boolean addUser(final Client client);
    void deleteUser(final Client client);
    Client findUser(final Client client);
}
