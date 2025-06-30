package com.example.wellsfargo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This tells Spring Boot this class will handle web requests
@RestController
public class HomeController {

    // This says "when someone visits /, run this method"
    @GetMapping("/")
    public String home() {
        return "✅ Hello! Your Wells Fargo App is running!";
    }
}
