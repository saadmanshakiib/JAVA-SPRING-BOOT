package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("/sakib")
    public String sayHello(){
        return "Hello Sadman sakib, Welcome to spring boot";
    }

}
