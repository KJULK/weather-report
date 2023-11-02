package com.springboot.thenewkotlinproject.controller


import com.springboot.thenewkotlinproject.entity.Daily
import com.springboot.thenewkotlinproject.entity.ForecastResponse

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import com.springboot.thenewkotlinproject.entity.WeatherResponse
import com.springboot.thenewkotlinproject.service.WeatherService
import reactor.core.publisher.Mono

@RestController
 class WeatherController (private val service: WeatherService) {


	@GetMapping("/weather-report")
	fun getWeatherReport(): Mono<WeatherResponse> {
		var response = service.getWeatherDetails();
		var weatherResponse = response.map {
			x -> transformResponse(x);
		}.share();

		return weatherResponse;
	}


	fun transformResponse(forecast: ForecastResponse) : WeatherResponse
	{
		var today = forecast.properties.periods[0];
		var weatherResponse = WeatherResponse();

		weatherResponse.daily = arrayOf<Daily>();
		var daily =  Daily();
		daily.day_name = today.name;
		daily.forecast_blurp = today.shortForecast;
		if(today.temperatureUnit == "F") {
		var	celsius = ((today.temperature-32)*5)/9;
			daily.temp_high_celsius = celsius;
		}
		weatherResponse.daily += daily;
		return weatherResponse;
	}
}
