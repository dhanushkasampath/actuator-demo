package com.test.actuatordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/my-controller")
    public String retrieveConfigurationsWithoutHystrix() {
        return "Hellow from MyController";
    }
}
