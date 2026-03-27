package com.greetingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greetingapp.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}