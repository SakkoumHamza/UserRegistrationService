package com.hamza.userregistrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegistrationServiceApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(UserRegistrationServiceApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L,"hamzasakkoum1@gmail.com","12345678","Hamza"));
    }

}
