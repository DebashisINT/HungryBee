package com.breezehungrybee.features.NewQuotation.api

import com.breezehungrybee.base.BaseResponse
import com.breezehungrybee.features.NewQuotation.model.AddQuotRequestData
import com.breezehungrybee.features.NewQuotation.model.EditQuotRequestData
import com.breezehungrybee.features.NewQuotation.model.ViewDetailsQuotResponse
import com.breezehungrybee.features.NewQuotation.model.ViewQuotResponse
import io.reactivex.Observable

class GetQuotListRegRepository(val apiService : GetQutoListApi) {

    fun addQuot(shop: AddQuotRequestData): Observable<BaseResponse> {
        return apiService.getAddQuot(shop)
    }

    fun viewQuot(shopId: String): Observable<ViewQuotResponse> {
        return apiService.getQuotList(shopId)
    }

    fun viewDetailsQuot(quotId: String): Observable<ViewDetailsQuotResponse> {
        return apiService.getQuotDetailsList(quotId)
    }

    fun viewDetailsDoc(docId: String): Observable<ViewDetailsQuotResponse> {
        return apiService.getDocDetailsList(docId)
    }

    fun delQuot(quotId: String): Observable<BaseResponse>{
        return apiService.QuotDel(quotId)
    }

    fun editQuot(shop: EditQuotRequestData): Observable<BaseResponse> {
        return apiService.editQuot(shop)
    }


}