package com.kudryavtsevgennady.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    //    @Autowired
    private Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("car") Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Person bean is created");
    }

//    @Autowired
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        System.out.println("Person bean is created");
//    }

    public void startVehicleEngine() {
        System.out.println("Person is starting vehicle engine...");
        vehicle.startEngine();
    }
}
