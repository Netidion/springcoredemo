package com.net.springcoredemo.service;

import com.net.util.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // Define init method
    @PostConstruct
    public void startUpActions() {
        System.out.println("In startUpActions(): " + getClass().getSimpleName());
    }

    // Define destroy method
    @PreDestroy
    public void cleanUpActions() {
        System.out.println("In cleanUpActions(): " + getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!";
    }
}
