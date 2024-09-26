package com.breezehungrybee.features.photoReg.present

import com.breezehungrybee.app.domain.ProspectEntity
import com.breezehungrybee.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}