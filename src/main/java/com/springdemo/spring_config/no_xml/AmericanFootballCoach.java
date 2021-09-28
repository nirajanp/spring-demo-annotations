package com.springdemo.spring_config.no_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmericanFootballCoach implements Coach{
    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyTraining() {
        return "Practice running faster";
    }

    @Override
    public String getFortune() {
        return "American Football Coach: " + fortuneService.getFortune();
    }
}
