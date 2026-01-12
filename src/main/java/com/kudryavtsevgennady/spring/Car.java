package com.kudryavtsevgennady.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car: Wrooom wrooom!");
    }
}
