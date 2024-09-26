package com.breezehungrybee.features.photoReg.adapter

import com.breezehungrybee.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}