package com.springdemo.di_setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        // Load config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setterInjAppContext.xml");

        // retrieve beans
        BadmintonCoach theCoach = context.getBean("badmintonCoach", BadmintonCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        context.close();

    }
}
