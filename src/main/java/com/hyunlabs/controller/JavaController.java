package com.hyunlabs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    @RequestMapping("/")
    String root() {
        return "Welcome to zombocom";
    }

    @RequestMapping("/java")
    String java() {
        return "Java controller method";
    }

}