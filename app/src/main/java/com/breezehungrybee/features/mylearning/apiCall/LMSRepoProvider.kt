package com.breezehungrybee.features.mylearning.apiCall

import com.breezehungrybee.features.login.api.opportunity.OpportunityListApi
import com.breezehungrybee.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}