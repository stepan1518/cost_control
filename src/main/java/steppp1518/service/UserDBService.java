package steppp1518.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import steppp1518.database.Client;
import steppp1518.database.ClientRepository;

@Component
public class UserDBService implements UserService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public boolean addUser(final Client client) {
        synchronized (this) {
            if (hasUser(client.getEmail())) return false;
            clientRepository.save(client);
        }
        return true;
    }

    @Override
    public void deleteUser(final Client client) {

    }

    @Override
    public Client findUser(final Client client) {
        return null;
    }

    private boolean hasUser(final String email) {
        return clientRepository.findByEmail(email) != null;
    }
}
