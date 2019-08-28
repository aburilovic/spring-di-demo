package com.aburilovic.springdidemo.controllers;

import com.aburilovic.springdidemo.service.GreetingService;
import com.aburilovic.springdidemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    GreetingService greetingServiceImpl; // or use @Qualifier

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
