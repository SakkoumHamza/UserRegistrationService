package com.hamza.userregistrationservice;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
