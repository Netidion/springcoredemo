package com.net.springcoredemo.config;

import com.net.springcoredemo.service.SwimCoach;
import com.net.util.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    /**
     * By default, the bean id is the method name - lowercase class name e.g.: swimCoach
     * But we can define a bean id by adding it in the Bean annotation as below e.g.: aquatic
     */
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
