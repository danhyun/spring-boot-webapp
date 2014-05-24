package com.hyunlabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegularController {

    @RequestMapping("/a")
    String hi() {
        return "main/index";
    }

}
