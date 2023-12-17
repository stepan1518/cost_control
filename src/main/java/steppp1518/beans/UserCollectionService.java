package steppp1518.beans;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserCollectionService implements UserService {
    //Replace for Atomic
    private static Map<String, User> _users = new HashMap<>();
    @Override
    public void addUser(final User user) {
        User data = null;
        synchronized (this) {
            if ((data = _users.get(user.get_email())) != null) return;
            _users.put(user.get_email(), user);
        }
    }

    @Override
    public void deleteUser(final String email) {

    }

    @Override
    public void updateUser(final User user) {

    }

    @Override
    public synchronized User getUser(final String email) {
        return _users.get(email);
    }
}
