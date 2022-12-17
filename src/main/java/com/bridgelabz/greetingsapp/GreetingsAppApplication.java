package com.bridgelabz.greetingsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingsAppApplication.class, args);
        System.out.println("welcome to greeting app");
    }

}
