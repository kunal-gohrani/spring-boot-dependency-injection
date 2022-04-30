package com.springdi.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        // TODO Auto-generated method stub
        return "Hello from primary bean";
    } 


}
