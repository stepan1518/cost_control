package steppp1518.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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

    @Transactional
    @Override
    public boolean addUser(final Client client) {
        if (hasUser(client.getEmail())) return false;
        client.setPassword(passwordEncoder.encode(client.getPassword()));
        try {
            clientRepository.save(client);
            return true;
        } catch (DataIntegrityViolationException e) {
            return false;
        }
    }

    @Transactional
    @Override
    public void removeUser(final String email) {
        clientRepository.deleteAll();
    }

    @Transactional
    @Override
    public Client findUser(final String email) {
        return clientRepository.findByEmail(email);
    }

    private boolean hasUser(final String email) {
        return findUser(email) != null;
    }

    @Transactional
    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        return findUser(username);
    }
}
