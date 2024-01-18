package steppp1518.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import steppp1518.database.Client;
import steppp1518.database.ClientRepository;

@Service
public class UserDBService implements UserService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public boolean addUser(final Client client) {
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
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        return clientRepository.findByEmail(username);
    }
}
