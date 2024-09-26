package com.breezehungrybee.features.viewAllOrder.interf

import com.breezehungrybee.app.domain.NewOrderColorEntity
import com.breezehungrybee.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}