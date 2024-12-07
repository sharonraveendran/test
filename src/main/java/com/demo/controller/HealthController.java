package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        System.out.println("Health check endpoint called");
        Map<String, String> response = new HashMap<>();
        response.put("status", "healthy");
        return response;
    }

    @GetMapping("/restart")
    public Map<String, String> restart() {
        System.out.println("Restart endpoint called");
        Map<String, String> response = new HashMap<>();
        response.put("status", "restarted");
        return response;
    }
}
