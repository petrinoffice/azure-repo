package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LogicService {
    public String doPrepare() {
        String message = "Do some logic operation ";

        return message + new Date();
    }
}
