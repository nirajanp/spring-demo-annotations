package com.springdemo.di_constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getYourDailyWorkout() {
        return "Practice sprinting";
    }

    @Override
    public String getFortune() {
        return "Football Coach: " + fortuneService.getFortune();
    }


}
