package com.first.webserviec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
    @GetMapping("/hello/{name}")
    public String Hello(@PathVariable String name){
        return "Hello, "+name+"Welcome to Spring Boot";
    }
}
