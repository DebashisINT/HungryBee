package com.breezehungrybee.features.dashboard.presentation.api.dayStartEnd

import com.breezehungrybee.features.stockCompetetorStock.api.AddCompStockApi
import com.breezehungrybee.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}