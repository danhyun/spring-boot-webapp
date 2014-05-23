package com.hyunlabs.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GroovyController {

    @RequestMapping("/groovy")
    String groovy() {
        "Hello from Groovy! ${new Date().format 'yyyy-MM-dd HH:mm:ss'}"
    }
}