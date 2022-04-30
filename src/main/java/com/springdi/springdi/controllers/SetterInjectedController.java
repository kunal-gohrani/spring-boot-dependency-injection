package com.springdi.springdi.controllers;

import com.springdi.springdi.services.GreetingServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedController {

    private GreetingServiceInterface greetingService;

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingServiceInterface greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
    
}
