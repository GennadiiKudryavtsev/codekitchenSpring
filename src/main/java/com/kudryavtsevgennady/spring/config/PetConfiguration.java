package com.kudryavtsevgennady.spring.config;

import com.kudryavtsevgennady.spring.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfiguration {

    @Bean
    public Dog dog() {
        return new Dog();
    }
}
