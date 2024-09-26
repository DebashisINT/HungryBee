package com.breezehungrybee.features.login.model.opportunitymodel

import com.breezehungrybee.app.domain.OpportunityStatusEntity
import com.breezehungrybee.app.domain.ProductListEntity
import com.breezehungrybee.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}