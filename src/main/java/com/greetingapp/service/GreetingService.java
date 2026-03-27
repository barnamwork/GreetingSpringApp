package com.greetingapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.greetingapp.repository.GreetingRepository;
import com.greetingapp.model.Greeting;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository repo;

    public Greeting saveGreeting(String message) {
        return repo.save(new Greeting(message));
    }

    public Greeting getGreetingById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with id: " + id));
    }
}