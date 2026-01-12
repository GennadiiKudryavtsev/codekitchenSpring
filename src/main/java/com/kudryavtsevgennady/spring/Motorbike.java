package com.kudryavtsevgennady.spring;

import org.springframework.stereotype.Component;

@Component
public class Motorbike implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Motorbike: Trrrrrrrrr!");
    }
}
