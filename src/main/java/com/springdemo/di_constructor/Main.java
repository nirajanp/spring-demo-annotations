package com.springdemo.di_constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("constructorInj-appContext.xml");

        Coach theCoach = context.getBean("footballCoach", Coach.class);

        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getYourDailyWorkout());
    }
}
