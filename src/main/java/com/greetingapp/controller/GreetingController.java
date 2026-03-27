package com.greetingapp.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.greetingapp.service.GreetingService;
import com.greetingapp.model.Greeting;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    GreetingService service;

    @PostMapping
    public Greeting save(@RequestParam String message) {
        return service.saveGreeting(message);
    }

    @GetMapping("/{id}")
    public Greeting getById(@PathVariable Long id) {
        return service.getGreetingById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAll() {
        return service.getAllGreetings();
    }

    @PutMapping("/{id}")
    public Greeting update(@PathVariable Long id, @RequestParam String message) {
        return service.updateGreeting(id, message);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteGreeting(id);
    }
}