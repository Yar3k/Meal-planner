package main.mealplanner.service;

import main.mealplanner.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import main.mealplanner.model.User;
@Service
public class UserService {
    private static List<User> users = new ArrayList<>();
    private static int count = 3;

    static {
        users.add(new User(1, "Jaroslav"));
        users.add(new User(2, "Dmitry"));
        users.add(new User(3, "Aleksej"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByID(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public List<User> getUsersByName(String title) {
        List<User> res = new ArrayList<>();
        for (User item : users) {
            if (item.getName().equals(title)) {
                res.add(item);
            }
        }
        return res;
    }

    public void updateUser(User u) {
        users.remove(u);
        users.add(u);
    }

    public void addUser(int id, String name) {
        users.add(new User(id, name));
    }

    public void add (User user){
        users.add(user);
    }

    public void deleteUser(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.getId() == id) {
                iterator.remove();
            }
        }
    }
}
