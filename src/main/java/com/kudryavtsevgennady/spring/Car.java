package com.kudryavtsevgennady.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Car implements Vehicle{

    public Car() {
        System.out.println("Car bean is created!");
    }

    @PostConstruct
    public void init() {
        System.out.println("Car init method is called!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Car destroy method is called!");
    }

    @Override
    public void startEngine() {
        System.out.println("Car: Wrooom wrooom!");

    }
}
