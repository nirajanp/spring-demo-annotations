package com.springdemo.annotation_qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("qualifierAnnotationAppcontext.xml");

        Coach theCoach = context.getBean("frisbeeCoach", Coach.class);
        System.out.println(theCoach.getFortune());
    }
}
