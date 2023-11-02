package com.springboot.thenewkotlinproject.service

import com.springboot.thenewkotlinproject.entity.ForecastResponse
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Service
 class WeatherService {

   fun getWeatherDetails(): Mono<ForecastResponse>
   {
      val webClient = WebClient.builder().baseUrl("https://api.weather.gov/gridpoints/MLB/33,70").build();
      val response =  webClient.get().uri("/forecast").accept(MediaType.APPLICATION_JSON)
         .retrieve()
         .bodyToMono(ForecastResponse::class.java);
       return response;
   }
}