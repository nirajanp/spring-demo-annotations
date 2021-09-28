package com.springdemo.spring_config.no_xml;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "You have a good fortune";
    }
}
