package com.kudryavtsevgennady.spring;

public class Person {
    private Vehicle vehicle;
    private Dog dog;

    public Person(Vehicle vehicle, Dog dog) {
        this.vehicle = vehicle;
        this.dog = dog;
    }

    public void startVehicleEngine() {
        System.out.println("Person is starting vehicle engine ...");
        vehicle.startEngine();
    }

    public void callPet() {
        System.out.println("Person is starting to call his pet ...");
        System.out.println(dog.getName() + " come to me!");
    }
}
