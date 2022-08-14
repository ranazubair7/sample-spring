package com.spring.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "a sample spring api";
    }
}
