package com.bridelabz.nitish.greetingapp.dto;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String message;

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }
    public Greeting() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
