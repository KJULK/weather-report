package com.springboot.thenewkotlinproject.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import reactor.util.annotation.Nullable

@JsonIgnoreProperties(ignoreUnknown = true)
class Period {
	
	 var number: Int = 0
	get() = field
	set(value) {field = value}
	
	var name: String = ""
	get() = field
	set(value) {field = value}
	
	var startTime: String = ""
	get() = field
	set(value) {field = value}
	
	var endTime: String = ""
	get() = field
	set(value) {field = value}
	
	var isDaytime: Boolean = true
	get() = field
	set(value) {field = value}
	
	var temperature: Int = 0
	get() = field
	set(value) {field = value}
	
	var temperatureUnit: String = ""
	get() = field
	set(value) {field = value}

	
	var shortForecast: String = ""
	get() = field
	set(value) {field = value}
	
	
	
	
	
}