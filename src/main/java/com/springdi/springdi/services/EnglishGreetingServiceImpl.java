package com.springdi.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"english","default"})
@Service("languageGreetingServiceImpl")
public class EnglishGreetingServiceImpl implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        return "Hello World - English";
    }
    
}
