package com.springdemo.di_field;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        // Load config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("feildInjAppContext.xml");

        // retrieve beans
        Coach theCoach = context.getBean("badmintonCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        context.close();

    }
}
