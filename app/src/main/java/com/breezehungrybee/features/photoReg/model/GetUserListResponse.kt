package com.breezehungrybee.features.photoReg.model

import com.breezehungrybee.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}