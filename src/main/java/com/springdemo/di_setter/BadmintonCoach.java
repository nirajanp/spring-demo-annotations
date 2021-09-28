package com.springdemo.di_setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{
    private FortuneService fortuneService;
    private String s;

    public BadmintonCoach(){
        System.out.println("Constructor: BC");
    }

    // Step 1: define setter method
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter Method: setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Autowired
    public void setLaugh(FortuneService fortuneService){
        System.out.println("Hahaha!!");
        this.s = s;
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
