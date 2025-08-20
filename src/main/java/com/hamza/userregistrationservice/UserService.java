package com.hamza.userregistrationservice;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository ;
    private NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user){
        userRepository.save(user);
        notificationService.send("Hello world","hamzasakkoum1@gmail.com");
        System.out.println("User registered successfully");
    }

}
