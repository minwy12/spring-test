package com.owen.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        System.out.println("index() called");
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/owen")
    public String getOwen() {
        System.out.println("getOwen() called");
        return "Greetings from OWEN!!";
    }
}
