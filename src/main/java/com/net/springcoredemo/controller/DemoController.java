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

    private Coach anotherCoach;

    /**
     * Define constructor injection
     * Bean annotated with Primary will be picked from spring
     * Only one bean must be annotated with Primary
     * Qualifier has higher priority than Primary
     */
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach theOtherCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theOtherCoach;
    }

    /**
     * Default Bean Scope is Singleton, meaning the objects created are references to the same bean,
     * hence myCoach == anotherCoach => true
     * With Scope Prototype annotation the objects created are different
     * hence myCoach == anotherCoach => false
     */

    @GetMapping("/check")
    public String checkBeans() {
        return "Comparing Beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
