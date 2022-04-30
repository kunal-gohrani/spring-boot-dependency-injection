package com.springdi.springdi.controllers;

import com.springdi.springdi.services.GreetingServiceInterface;

import org.springframework.stereotype.Component;

@Component
public class PrimaryBeanInjectedController {
    private final GreetingServiceInterface greetingService;


    public PrimaryBeanInjectedController(GreetingServiceInterface greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
