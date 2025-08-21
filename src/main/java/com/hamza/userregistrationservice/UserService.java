package com.hamza.userregistrationservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository ;
    private NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) { // Using email as a primary bean
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user){
        userRepository.save(user);
        notificationService.send("You registred successfully",user.getEmail());
        System.out.println("User registered successfully");
    }

}
