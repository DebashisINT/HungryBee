package com.breezehungrybee.features.weather.api

import com.breezehungrybee.features.task.api.TaskApi
import com.breezehungrybee.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}