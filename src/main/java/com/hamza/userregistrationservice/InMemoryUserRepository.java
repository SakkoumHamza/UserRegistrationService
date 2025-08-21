package com.hamza.userregistrationservice;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Repository // Annotation To interact with the database
public class InMemoryUserRepository implements UserRepository {

    private final Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user.toString());
        users.put(user.getEmail(), user); // save user in memory
    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email,null);
    }
}
