package com.breezehungrybee.features.viewAllOrder.interf

import com.breezehungrybee.app.domain.NewOrderProductEntity
import com.breezehungrybee.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}