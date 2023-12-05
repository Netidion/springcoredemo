package com.net.springcoredemo.service;

import com.net.util.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice!";
    }
}
