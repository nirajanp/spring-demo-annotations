package com.springdemo.annotations;

import com.springdemo.annotations.Coach;
import org.springframework.stereotype.Component;

// Here we are giving name to the bean id in component annotation
// . i.e. @Component("theCoach")
// However, if we want to use default bean id then it is
// class name with initial letter in lowercase i.e. tennisCoach
@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice tennis Bro!!";
    }
}
