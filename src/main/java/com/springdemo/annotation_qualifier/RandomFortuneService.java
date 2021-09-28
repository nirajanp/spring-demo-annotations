package com.springdemo.annotation_qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String[] data = {"Beware of wolf in sheep's clothing",
                                "Dilligence is the mother of good luck",
                                 "The Journey is the reward"};
    private Random random = new Random();
    public String getFortune() {
        int index = random.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
