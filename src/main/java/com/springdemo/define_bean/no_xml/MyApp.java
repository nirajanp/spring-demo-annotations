package com.springdemo.define_bean.no_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportsConfig.class);

        // get bean from spring container
        Coach theCoach =context.getBean("swimCoach", Coach.class);

        System.out.println(theCoach.getDailyTraining());
        System.out.println(theCoach.getFortune());

        context.close();

    }
}
