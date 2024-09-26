package com.breezehungrybee.features.stockAddCurrentStock.api

import com.breezehungrybee.base.BaseResponse
import com.breezehungrybee.features.location.model.ShopRevisitStatusRequest
import com.breezehungrybee.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezehungrybee.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezehungrybee.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezehungrybee.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}