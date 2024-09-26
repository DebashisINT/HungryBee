package com.breezehungrybee.features.viewAllOrder.interf

import com.breezehungrybee.app.domain.NewOrderGenderEntity
import com.breezehungrybee.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}