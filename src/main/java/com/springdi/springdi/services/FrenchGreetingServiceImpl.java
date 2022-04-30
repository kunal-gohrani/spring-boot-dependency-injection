package com.springdi.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("french")
@Service("languageGreetingServiceImpl")
public class FrenchGreetingServiceImpl implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        return "Bonjour le monde";
    }
    
}
