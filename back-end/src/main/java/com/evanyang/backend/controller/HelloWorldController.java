package com.evanyang.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @CrossOrigin
    @RequestMapping("/aws")
    public String home() {
        return "Hello AWS training";
    }
}
