package com.greetingapp.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;
import com.greetingapp.service.GreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    GreetingService service;

    @GetMapping
    public Map<String, String> getGreeting() {
        return Map.of("message", service.getGreeting());
    }
}