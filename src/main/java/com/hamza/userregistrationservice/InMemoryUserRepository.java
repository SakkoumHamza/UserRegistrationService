package com.hamza.userregistrationservice;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository {

    private final HashMap<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getEmail(), user); // save user in memory
    }
}
