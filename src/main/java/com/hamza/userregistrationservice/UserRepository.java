package com.hamza.userregistrationservice;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

public interface UserRepository {
    public void save(User user);
}
