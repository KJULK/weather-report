package com.springboot.thenewkotlinproject.entity

class Daily {
    var day_name: String = ""
    get() = field
    set(value) {field = value}
    var temp_high_celsius: Int = 0
    get() = field
    set(value) {field = value}
    var forecast_blurp: String = ""
        get() = field
        set(value) {field = value}
}