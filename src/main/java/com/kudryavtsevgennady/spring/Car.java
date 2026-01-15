package com.kudryavtsevgennady.spring;

public class Car implements Vehicle{

    public Car() {
        System.out.println("Car bean is created!");
    }

    @Override
    public void startEngine() {
        System.out.println("Car: Wrooom wrooom!");

    }
}
