package com.breezehungrybee.features.activities.api

import com.breezehungrybee.features.member.api.TeamApi
import com.breezehungrybee.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}