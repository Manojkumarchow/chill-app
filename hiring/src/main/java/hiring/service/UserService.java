package hiring.service;

import hiring.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static List<User> users = new ArrayList<>();
    private static long idCounter = 0;

    static {
        users.add(new User(++idCounter, "Manoj", "Admin"));
        users.add(new User(++idCounter, "Kumar", "Biz-Admin"));
        users.add(new User(++idCounter, "Yashwanth", "Staff"));
        users.add(new User(++idCounter, "Tilak",
                "Normal User"));
    }

    public List<User> findAll() {
        return users;
    }

    public String getAllUsers() {
        return "All Users";
    }
}
