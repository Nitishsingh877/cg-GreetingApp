package com.bridelabz.nitish.greetingapp.Controller;

import com.bridelabz.nitish.greetingapp.dto.Greeting;
import com.bridelabz.nitish.greetingapp.repository.GreetingRepository;
import com.bridelabz.nitish.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GreetingController {
    @Autowired
    private GreetingRepository greetingServices;
    @Autowired
    private GreetingService greetingService;
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

    //uc04
    @PutMapping("/greeting/{id}")
    public ResponseEntity<Greeting> UpdateGreeting(@PathVariable long id, @RequestBody Greeting updateGreeting) {
       Greeting greeting = greetingService.updateGreeting(id, updateGreeting.getMessage());
       if(greeting == null) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }else {
           return new ResponseEntity<>(greeting, HttpStatus.OK);
       }
    }

    @DeleteMapping("/delete/{id}")
    public boolean DeleteGreeting(@PathVariable long id) {
            if(greetingServices.findById(id) == null) {
                return false;
            }else {
                greetingServices.deleteById(id);
                return true;
            }
    }

}

