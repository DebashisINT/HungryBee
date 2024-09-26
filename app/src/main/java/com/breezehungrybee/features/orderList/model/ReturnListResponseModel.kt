package com.breezehungrybee.features.orderList.model

import com.breezehungrybee.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}