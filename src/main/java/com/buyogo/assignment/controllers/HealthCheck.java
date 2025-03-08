package com.buyogo.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//healthCheck controller to chek whether API is working or not

@RestController
@RequestMapping("/health-check")
public class HealthCheck {

    @GetMapping
    public String healthCheck(){
        return "ok";
    }

}
