package com.breezehungrybee.features.newcollectionreport

import com.breezehungrybee.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}