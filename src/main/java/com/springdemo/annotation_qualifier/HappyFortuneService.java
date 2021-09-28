package com.springdemo.annotation_qualifier;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "HappyFortuneService: Good Fortune";
    }
}
