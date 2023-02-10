package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {

    @GetMapping("/")
    public String main(){
        return "Hello " + new Date();
    }
}
