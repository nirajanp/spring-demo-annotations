package com.springdemo.di_field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
   @Autowired
   private FortuneService fortuneService;

    public BadmintonCoach(){
        System.out.println("Constructor: BC");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice short";
    }

    @Override
    public String getFortune() {
        return "From Badminton Coach" + fortuneService.getFortune();
    }
}
