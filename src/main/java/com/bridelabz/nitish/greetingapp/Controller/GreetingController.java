package com.bridelabz.nitish.greetingapp.Controller;

import com.bridelabz.nitish.greetingapp.dto.Greeting;
import com.bridelabz.nitish.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GreetingController {
    @Autowired
    private GreetingRepository greetingServices;
    //uc01
    @PostMapping("/greeting")
    public Greeting saveGreeting(@RequestBody Greeting greeting) {
        return greetingServices.save(greeting);
    }
    //uc02
    @GetMapping("/get/{id}")
    public Greeting getGreeting(@PathVariable long id) {
        Optional<Greeting> greeting = greetingServices.findById(id);
        return greeting.orElse(null);
    }
    //uc03
    @GetMapping("/get/greetings")
    public List<Greeting> getGreetings() {
        return greetingServices.findAll();
    }

}

