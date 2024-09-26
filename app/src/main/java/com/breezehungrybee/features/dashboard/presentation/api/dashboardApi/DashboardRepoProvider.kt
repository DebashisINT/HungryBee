package com.breezehungrybee.features.dashboard.presentation.api.dashboardApi

import com.breezehungrybee.features.login.api.LoginApi
import com.breezehungrybee.features.login.api.LoginRepository

/**
 * Created by Saikat on 26-Jun-20.
 */
object DashboardRepoProvider {
    fun provideDashboardImgRepository(): DashboardRepo {
        return DashboardRepo(DashboardApi.img())
    }

    fun provideDashboardRepository(): DashboardRepo {
        return DashboardRepo(DashboardApi.create())
    }
}