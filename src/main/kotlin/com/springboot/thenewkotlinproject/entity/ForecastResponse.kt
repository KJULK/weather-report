package com.springboot.thenewkotlinproject.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class ForecastResponse {
    var properties: Properties = Properties()
        get() = field
        set(value) {field = value}
}

