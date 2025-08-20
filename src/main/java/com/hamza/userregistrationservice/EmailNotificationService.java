package com.hamza.userregistrationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {

    @Value("${spring.email.host}")
    private String host;
    @Value("${spring.email.port}")
    private int port;
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Email is sending ...");
        System.out.println(message+" to: "+recipientEmail);
        System.out.println("At host"+ host);
        System.out.println("Port"+ port);
    }
}
