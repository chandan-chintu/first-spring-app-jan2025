package com.myfirstspringapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/sample/api")
public class SampleController {

    @GetMapping("/getsample")
    public String getSample(){
        return "This is our first sample API";
    }

    @GetMapping("/getsample2")
    public String getSample2(){
        return "This is our second sample API";
    }
}
