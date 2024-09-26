package com.breezehungrybee.features.viewAllOrder.interf

import com.breezehungrybee.app.domain.NewOrderGenderEntity
import com.breezehungrybee.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}