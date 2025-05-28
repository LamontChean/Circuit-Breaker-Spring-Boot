package com.service.circuitbreaker.controller;

import com.service.circuitbreaker.service.UnstableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private UnstableService unstableService;

    @GetMapping("/test")
    public String testCircuitBreaker() {
        return unstableService.callExternalService();
    }
}
