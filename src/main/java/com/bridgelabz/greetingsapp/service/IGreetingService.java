package com.bridgelabz.greetingsapp.service;

import com.bridgelabz.greetingsapp.model.Greeting;
import com.bridgelabz.greetingsapp.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
}
