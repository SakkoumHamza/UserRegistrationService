package com.hamza.userregistrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegistrationServiceApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(UserRegistrationServiceApplication.class, args);
        UserService userService = (UserService) context.getBean("userService");
        User hamza = context.getBean(User.class);
        userService.registerUser(hamza);
        hamza.setId(12L);
        hamza.setName("Hamza");
        hamza.setEmail("hamzasakkoum1@gmail.com");
        hamza.setPassword("12345678");
    }

}
