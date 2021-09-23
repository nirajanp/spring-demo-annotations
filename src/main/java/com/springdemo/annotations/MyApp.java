package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        // read the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        Coach alphaCoach = context.getBean("basketballCoach", Coach.class);

        // call method on bean
        System.out.println("Tennis Coach: "+theCoach.getDailyWorkout());

        System.out.println("Basketball Coach: " + alphaCoach.getDailyWorkout());

        // close context
        context.close();
    }
}
