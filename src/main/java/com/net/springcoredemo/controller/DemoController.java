package com.net.springcoredemo.controller;

import com.net.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // Define a private field for the dependency
    // No need to define constructor or setter injection
    // Not recommended by spring.oi team since it makes the code harder to unit test.
    @Autowired
    private Coach myCoach;

    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
