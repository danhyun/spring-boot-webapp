package com.hyunlabs.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping('/hi')
class NormalController {

    @RequestMapping('{id}')
    ModelAndView hi(@PathVariable('id') String id) {
        new ModelAndView('main/index', 'message', id)
    }

}
