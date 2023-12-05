package com.net.springcoredemo.controller;

import com.net.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    /* Define a private field for the dependency */
    private Coach myCoach;

    /**
     * Define constructor injection
     * Bean annotated with Primary will be picked from spring
     * Only one bean must be annotated with Primary
     * Qualifier has higher priority than Primary
     */
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
