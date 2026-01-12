package com.kudryavtsevgennady.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.kudryavtsevgennady.spring");
        Vehicle vehicle = context.getBean("motorbike", Vehicle.class);
        vehicle.startEngine();
        context.close();
    }
}
