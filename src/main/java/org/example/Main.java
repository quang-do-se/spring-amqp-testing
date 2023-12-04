package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

@SpringBootApplication
public class Main implements ApplicationRunner {
    @Autowired
    RabbitProperties rabbitProperties;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(final ApplicationArguments args) {
        System.err.println("Host: " + rabbitProperties.getHost());
        System.err.println("Username: " + rabbitProperties.getUsername());
        System.err.println("Password: " + rabbitProperties.getPassword());
    }
}

