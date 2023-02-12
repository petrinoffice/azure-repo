package com.example.demo.controllers;

import com.example.demo.service.LogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicController {

    @Autowired
    private LogicService logicService;

    @GetMapping("/logic")
    public String controllerWithLogic(){
        return logicService.doPrepare();
    }
}
