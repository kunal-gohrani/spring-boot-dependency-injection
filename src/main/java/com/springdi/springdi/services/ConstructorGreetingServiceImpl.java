package com.springdi.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        return "Hello from Constructor way of Dependency Injection";
    }
    
}
