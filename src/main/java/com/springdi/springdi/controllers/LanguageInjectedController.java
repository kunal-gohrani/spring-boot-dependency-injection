package com.springdi.springdi.controllers;

import com.springdi.springdi.services.GreetingServiceInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LanguageInjectedController {
    private final GreetingServiceInterface greetingService;

    public LanguageInjectedController(@Qualifier("languageGreetingServiceImpl") GreetingServiceInterface greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
