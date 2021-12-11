package main.mealplanner.service;

import main.mealplanner.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.mealplanner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.mealplanner.model.User;
@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        return (List<User>) repository.findAll();
    }
/*
    public List<User> getAllUsers() {
        return users;
    }*/
/*
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
*/

    public void add (User user){
        repository.save(user);
    }
/*
    public void deleteUser(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.getId() == id) {
                iterator.remove();
            }
        }
    }*/
}
