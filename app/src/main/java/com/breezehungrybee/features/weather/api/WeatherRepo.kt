package com.breezehungrybee.features.weather.api

import com.breezehungrybee.base.BaseResponse
import com.breezehungrybee.features.task.api.TaskApi
import com.breezehungrybee.features.task.model.AddTaskInputModel
import com.breezehungrybee.features.weather.model.ForeCastAPIResponse
import com.breezehungrybee.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}