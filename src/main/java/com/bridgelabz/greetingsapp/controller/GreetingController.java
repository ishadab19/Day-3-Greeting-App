package com.bridgelabz.greetingsapp.controller;

import com.bridgelabz.greetingsapp.model.Greeting;
import com.bridgelabz.greetingsapp.model.User;
import com.bridgelabz.greetingsapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value = {"","/"})
    public  Greeting greeting(@RequestParam String firstName,@RequestParam String lastName){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);


    }
}