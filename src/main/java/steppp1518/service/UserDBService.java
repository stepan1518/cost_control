package steppp1518.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import steppp1518.database.Client;
import steppp1518.database.ClientRepository;

@Component
public class UserDBService implements UserService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public boolean addUser(final Client client) {
        synchronized (this) {
            if (hasUser(client.getEmail())) return false;
            client.setPassword(passwordEncoder.encode(client.getPassword()));
            clientRepository.save(client);
        }
        return true;
    }

    @Override
    public void deleteUser(final String email) {
        clientRepository.deleteAll();
    }

    @Override
    public Client findUser(final String email) {
        return clientRepository.findByEmail(email);
    }

    private boolean hasUser(final String email) {
        return clientRepository.findByEmail(email) != null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findUser(username);
    }
}
