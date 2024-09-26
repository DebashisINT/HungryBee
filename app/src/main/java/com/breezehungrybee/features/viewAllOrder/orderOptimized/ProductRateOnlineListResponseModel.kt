package com.breezehungrybee.features.viewAllOrder.orderOptimized

import com.breezehungrybee.app.domain.ProductOnlineRateTempEntity
import com.breezehungrybee.base.BaseResponse
import com.breezehungrybee.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}