package com.springdemo.annotations;

import com.springdemo.annotations.Coach;
import org.springframework.stereotype.Component;

@Component("theCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice tennis Bitch!!";
    }
}
