package com.springdemo.define_bean.no_xml;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(){}

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyTraining() {
        return "Swim Swim Swim!!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
