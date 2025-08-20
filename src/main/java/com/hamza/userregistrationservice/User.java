package com.hamza.userregistrationservice;

import org.springframework.stereotype.Service;

@Service
public class User {
    private Long id ;
    private String email;
    private String password ;
    private String name;
    public User(Long id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;

    }

    public void setId(Long id) {
        this.id = id;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
}
