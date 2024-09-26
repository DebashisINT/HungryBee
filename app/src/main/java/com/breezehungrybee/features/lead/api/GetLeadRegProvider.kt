package com.breezehungrybee.features.lead.api

import com.breezehungrybee.features.NewQuotation.api.GetQuotListRegRepository
import com.breezehungrybee.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}