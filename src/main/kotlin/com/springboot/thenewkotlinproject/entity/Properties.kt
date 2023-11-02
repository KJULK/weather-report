package com.springboot.thenewkotlinproject.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Properties {

    var periods: Array<Period> = arrayOf<Period>()
        get() = field
        set(value) {field = value}
}