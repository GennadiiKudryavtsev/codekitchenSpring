package com.kudryavtsevgennady.spring;

import com.kudryavtsevgennady.spring.config.PetConfiguration;
import com.kudryavtsevgennady.spring.config.VehicleConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Person person = context.getBean("person", Person.class);
        person.startVehicleEngine();
        person.callPet();
        context.close();

    }
}
