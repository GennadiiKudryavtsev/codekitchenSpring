package com.kudryavtsevgennady.spring;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    public Cat() {
        System.out.println("Cat bean is created");
    }
}
