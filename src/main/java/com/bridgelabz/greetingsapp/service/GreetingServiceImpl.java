package com.bridgelabz.greetingsapp.service;

import com.bridgelabz.greetingsapp.model.Greeting;
import com.bridgelabz.greetingsapp.model.User;
import com.bridgelabz.greetingsapp.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements IGreetingService {
    @Autowired
    private IGreetingRepository greetingRepository;

    private static final String template = "Hello ,%s";
    private final AtomicLong counter = new AtomicLong();


    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());

        return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
    }
}
