package com.breezehungrybee.features.location.api

import com.breezehungrybee.features.location.shopdurationapi.ShopDurationApi
import com.breezehungrybee.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}