package com.breezehungrybee.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezehungrybee.app.FileUtils
import com.breezehungrybee.app.Pref
import com.breezehungrybee.base.BaseResponse
import com.breezehungrybee.features.addshop.model.AddLogReqData
import com.breezehungrybee.features.addshop.model.AddShopRequestData
import com.breezehungrybee.features.addshop.model.AddShopResponse
import com.breezehungrybee.features.addshop.model.LogFileResponse
import com.breezehungrybee.features.addshop.model.UpdateAddrReq
import com.breezehungrybee.features.contacts.CallHisDtls
import com.breezehungrybee.features.contacts.CompanyReqData
import com.breezehungrybee.features.contacts.ContactMasterRes
import com.breezehungrybee.features.contacts.SourceMasterRes
import com.breezehungrybee.features.contacts.StageMasterRes
import com.breezehungrybee.features.contacts.StatusMasterRes
import com.breezehungrybee.features.contacts.TypeMasterRes
import com.breezehungrybee.features.dashboard.presentation.DashboardActivity
import com.breezehungrybee.features.login.model.WhatsappApiData
import com.breezehungrybee.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}