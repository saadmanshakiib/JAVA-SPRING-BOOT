package com.telusko.DemoApp;

import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greet(){
        return "Hello Sadman";
    }
}
