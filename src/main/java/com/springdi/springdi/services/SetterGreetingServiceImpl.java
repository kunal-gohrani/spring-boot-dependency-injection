package com.springdi.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        return "Hello from Setter method way of Dependency Injection";
    }
    
}
