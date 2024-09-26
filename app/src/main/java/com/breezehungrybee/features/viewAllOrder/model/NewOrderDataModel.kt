package com.breezehungrybee.features.viewAllOrder.model

import com.breezehungrybee.app.domain.NewOrderColorEntity
import com.breezehungrybee.app.domain.NewOrderGenderEntity
import com.breezehungrybee.app.domain.NewOrderProductEntity
import com.breezehungrybee.app.domain.NewOrderSizeEntity
import com.breezehungrybee.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

