package com.breezehungrybee.features.location.shopRevisitStatus

import com.breezehungrybee.base.BaseResponse
import com.breezehungrybee.features.location.model.ShopDurationRequest
import com.breezehungrybee.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}