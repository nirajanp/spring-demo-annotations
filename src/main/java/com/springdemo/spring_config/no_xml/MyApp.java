package com.springdemo.spring_config.no_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        // read spi\ring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("americanFootballCoach", Coach.class);

        System.out.println(theCoach.getDailyTraining());
        System.out.println(theCoach.getFortune());
    }
}
