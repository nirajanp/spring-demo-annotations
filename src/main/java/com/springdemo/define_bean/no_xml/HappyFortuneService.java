package com.springdemo.define_bean.no_xml;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Good fortune";
    }
}
