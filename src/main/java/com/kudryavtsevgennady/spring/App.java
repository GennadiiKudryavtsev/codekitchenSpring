package com.kudryavtsevgennady.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.kudryavtsevgennady.spring");
        Person person = context.getBean("person", Person.class);
        person.startVehicleEngine();

        Parking parking = context.getBean("parking", Parking.class);
        System.out.println(parking.getVehicleList());
        System.out.println(parking.getVehicleMap());
        context.close();
    }
}
