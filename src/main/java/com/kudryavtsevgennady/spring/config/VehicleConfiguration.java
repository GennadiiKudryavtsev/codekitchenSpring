package com.kudryavtsevgennady.spring.config;

import com.kudryavtsevgennady.spring.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.security.PublicKey;

@Configuration
public class VehicleConfiguration {

    @Bean
    public Motorbike motorbike() {
        return new Motorbike();
    }

    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Person person(@Qualifier("car") Vehicle vehicle, Dog dog) {
        return new Person(vehicle, dog);
    }
}
