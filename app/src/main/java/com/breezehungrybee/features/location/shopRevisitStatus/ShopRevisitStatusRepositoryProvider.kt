package com.breezehungrybee.features.location.shopRevisitStatus

import com.breezehungrybee.features.location.shopdurationapi.ShopDurationApi
import com.breezehungrybee.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}