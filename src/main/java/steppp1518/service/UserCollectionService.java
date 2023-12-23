//package steppp1518.service;
//
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class UserCollectionService implements UserService {
//    //Replace to Atomic
//    private static Map<String, User> _users = new HashMap<>();
//    private static List<Waste> _wastes = new ArrayList<>();
//    @Override
//    public void addUser(final User user) {
//        User data = null;
//        synchronized (this) {
//            if ((data = _users.get(user.get_email())) != null) return;
//            _users.put(user.get_email(), user);
//        }
//    }
//
//    @Override
//    public void deleteUser(final String email) {
//
//    }
//
//    @Override
//    public void updateUser(final User user) {
//
//    }
//
//    @Override
//    public synchronized User getUser(final String email) {
//        return _users.get(email);
//    }
//
//    @Override
//    public synchronized List<Waste> getWastes(final String email) {
//        return _wastes.stream().filter(x -> x.get_email().equals(email)).toList();
//    }
//
//    @Override
//    public synchronized void addWaste(final Waste waste) {
//        _wastes.add(waste);
//    }
//}
