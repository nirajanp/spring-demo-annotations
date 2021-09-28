package com.springdemo.di_setter;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You have a wonderful day";
    }
}
