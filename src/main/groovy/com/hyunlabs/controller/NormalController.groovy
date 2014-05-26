package com.hyunlabs.controller

import org.springframework.social.connect.ConnectionRepository
import org.springframework.social.twitter.api.CursoredList
import org.springframework.social.twitter.api.Twitter
import org.springframework.social.twitter.api.TwitterProfile
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import javax.inject.Inject

@Controller
@RequestMapping('/hi')
class NormalController {

    ConnectionRepository connectionRepository

    Twitter twitter

    @Inject
    NormalController(Twitter twitter, ConnectionRepository connectionRepository) {
        this.connectionRepository = connectionRepository
        this.twitter = twitter
    }

    @RequestMapping('/protected')
    String protectedEndpoint(Model model) {
        String view = 'redirect:/connect/twitter'

        def connection = connectionRepository.findPrimaryConnection(Twitter.class)
        if (connection) {
            model.addAttribute(twitter.userOperations().getUserProfile())
            CursoredList<TwitterProfile> friends = twitter.friendOperations().getFriends()
            model.addAttribute('friends', friends)
            view = 'main/sup'
        }
        view
    }

    @RequestMapping('{id}')
    ModelAndView hi(@PathVariable('id') String id) {
        new ModelAndView('main/index', 'message', id)
    }

}
