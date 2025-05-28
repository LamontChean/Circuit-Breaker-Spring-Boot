package com.service.circuitbreaker.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UnstableService {

    private final Random random = new Random();

    @CircuitBreaker(name = "demoBreaker", fallbackMethod = "fallbackResponse")
    public String callExternalService() {
        if(random.nextInt(10) < 8)
            throw new RuntimeException("Run time error");

        return "API Test Success";
    }

    public String fallbackResponse(Throwable t) {
        return "Fallback response due to error: ";
    }
}
