package com.hyunlabs.models

import grails.persistence.*

@Entity
class Person {

    String firstName
    String lastName

    static constaints = {
        firstName blank: false
        lastName blank: false
    }

}
