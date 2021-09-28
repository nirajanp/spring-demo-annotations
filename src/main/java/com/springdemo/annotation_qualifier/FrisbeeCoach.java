package com.springdemo.annotation_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrisbeeCoach implements  Coach{
    @Autowired
    @Qualifier("randomFortuneService")
    // @Qualifier tells spring to which implementation class of Coach to use
    private FortuneService fortuneService;

    public FrisbeeCoach() {
        System.out.println("Frisbee Constructor");
    }


    @Override
    public String getYourTraining() {
        return "Throw frisbee straight";
    }

    @Override
    public String getFortune() {
        return "FrisbeeCoach: " + fortuneService.getFortune();
    }
}
