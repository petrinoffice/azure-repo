package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LogicServiceTest {

    private LogicService logicService = new LogicService();

    @Test
    void checkLogic(){
        String message = logicService.doPrepare();

        assertThat(message).contains("Do some logic");
    }

}