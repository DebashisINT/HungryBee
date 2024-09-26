package com.breezehungrybee.features.viewAllOrder.interf

import com.breezehungrybee.app.domain.NewOrderGenderEntity
import com.breezehungrybee.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}