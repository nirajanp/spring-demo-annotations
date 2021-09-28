package com.springdemo.define_bean.no_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SportsConfig {

    // define a bean for SwimCoach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

    // define a bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }
}
