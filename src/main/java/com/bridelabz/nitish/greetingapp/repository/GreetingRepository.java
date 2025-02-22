package com.bridelabz.nitish.greetingapp.repository;

import com.bridelabz.nitish.greetingapp.dto.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
   // Greeting addGreeting(User user);
}
