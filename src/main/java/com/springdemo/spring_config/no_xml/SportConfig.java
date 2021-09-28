package com.springdemo.spring_config.no_xml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// When we use @Configuration we do not need xml file.
@Configuration
@ComponentScan("com.springdemo.no_xml")
public class SportConfig {
}
