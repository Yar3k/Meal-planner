//package main.mealplanner.service;

import main.mealplanner.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.mealplanner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import main.mealplanner.model.User;
//@Service
//public class UserService implements UserDetailsService {
//    @Autowired
//    private UserRepository repository;
//
//    public List<User> getAllUsers() {
//        return (List<User>) repository.findAll();
//    }
//
//    public void add (User user){
//        repository.save(user);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = repository.findByEmail(email);
//        if (user == null){
//            System.out.println("User not exitst");
//            throw new UsernameNotFoundException("User not exitst");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
//    }

//}
