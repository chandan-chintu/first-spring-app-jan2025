package com.myfirstspringapp.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")
public class DemoController {

    @GetMapping
    public String getDemo(){
        return "This is our first Demo API";
    }
}
