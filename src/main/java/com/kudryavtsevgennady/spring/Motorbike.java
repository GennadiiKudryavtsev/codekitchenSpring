package com.kudryavtsevgennady.spring;

import org.springframework.stereotype.Component;

@Component
public class Motorbike implements Vehicle{

    public Motorbike() {
        System.out.println("Motorbike bean is created");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorbike: Trrrrrrrr!");
    }
}
