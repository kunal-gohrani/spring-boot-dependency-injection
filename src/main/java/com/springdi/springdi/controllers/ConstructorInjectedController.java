package com.springdi.springdi.controllers;

import com.springdi.springdi.services.GreetingServiceInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {

    //No need of using AutoWired annotation in Constructor way of dependency injection
    private final GreetingServiceInterface greetingService;
    // We are making a variable of the interface and in runtime it will be dynamically
    // allocated with the constructor greeting service class using qualifier annotation.

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingServiceInterface greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
