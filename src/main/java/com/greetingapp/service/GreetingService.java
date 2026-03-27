package com.greetingapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.greetingapp.repository.GreetingRepository;
import com.greetingapp.model.Greeting;

import java.util.List;

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
    public List<Greeting> getAllGreetings() {
        return repo.findAll();
    }

    public Greeting updateGreeting(Long id, String message) {
        Greeting g = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found"));

        g.setMessage(message);
        return repo.save(g);
    }

    public String deleteGreeting(Long id) {
        Greeting g = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found"));

        repo.delete(g);
        return "Deleted successfully";
    }
}