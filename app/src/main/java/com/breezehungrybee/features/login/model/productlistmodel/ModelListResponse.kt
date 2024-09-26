package com.breezehungrybee.features.login.model.productlistmodel

import com.breezehungrybee.app.domain.ModelEntity
import com.breezehungrybee.app.domain.ProductListEntity
import com.breezehungrybee.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}