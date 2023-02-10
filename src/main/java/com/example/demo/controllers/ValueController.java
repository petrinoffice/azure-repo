package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ValueController {

    @Value("${app.value}")
    private String value;

    @GetMapping("/value")
    public String fetchValue() {
        return value + " " + new Date();
    }
}
