package com.breezehungrybee.features.login.model

import com.breezehungrybee.app.domain.QuestionSubmitEntity


class GetQtsAnsSubmitDtlsResponseModel {
    var status:String? = null
    var message:String? = null
    var Question_list: ArrayList<QuestionSubmitEntity>? = null
}