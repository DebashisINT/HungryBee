package com.breezehungrybee.features.billing.model

import com.breezehungrybee.base.BaseResponse

/**
 * Created by Saikat on 20-02-2019.
 */
class BillingListResponseModel : BaseResponse() {
    var billing_list: ArrayList<BillingListDataModel>? = null
}