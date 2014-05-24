package com.hyunlabs.controller

import com.hyunlabs.models.Person
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import javax.servlet.http.HttpServletRequest


@RestController
@RequestMapping('/person/*')
class PersonController {

    @RequestMapping(method= RequestMethod.GET)
    String sup(String firstName) {
        def p = Person.findByFirstName firstName
        p ? "Sup ${p.firstName}" : 'No such person exists, yo'
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity add(HttpServletRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST
        def params = [:]
        request.parameterMap.keySet().each { k -> params[k] = request.getParameter k }

        Person.withTransaction {
            def p = new Person(params).save()
            status =  p ? HttpStatus.OK : HttpStatus.BAD_REQUEST
        }

        new ResponseEntity(status)
    }

}
