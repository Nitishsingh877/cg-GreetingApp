package com.bridelabz.nitish.greetingapp.service;

import com.bridelabz.nitish.greetingapp.dto.Greeting;
import com.bridelabz.nitish.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    public Optional<Greeting> findById(Long id) {
        return greetingRepository.findById(id);
    }

    public Greeting updateGreeting(long id , String newGreeting) {
        Optional<Greeting> greetingOptional = greetingRepository.findById(id);
        if (greetingOptional.isPresent()) {
            Greeting greeting = greetingOptional.get();
            greeting.setMessage(newGreeting);
            return greetingRepository.save(greeting);
        }else {
            return null;
        }
    }
}
