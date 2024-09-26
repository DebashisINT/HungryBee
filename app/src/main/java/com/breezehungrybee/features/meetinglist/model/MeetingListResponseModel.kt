package com.breezehungrybee.features.meetinglist.model

import com.breezehungrybee.base.BaseResponse
import com.breezehungrybee.features.location.model.MeetingDurationDataModel
import java.io.Serializable

/**
 * Created by Saikat on 21-01-2020.
 */
class MeetingListResponseModel : BaseResponse(), Serializable {
    var meeting_list: ArrayList<MeetingDurationDataModel>? = null
}