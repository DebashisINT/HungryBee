package com.breezehungrybee.features.myjobs.api

import android.content.Context
import android.net.Uri
import android.util.Log
import com.breezehungrybee.app.FileUtils
import com.breezehungrybee.base.BaseResponse
import com.breezehungrybee.features.activities.model.ActivityImage
import com.breezehungrybee.features.activities.model.AddActivityInputModel
import com.breezehungrybee.features.myjobs.model.WIPSubmit
import com.fasterxml.jackson.databind.ObjectMapper
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

object MyJobRepoProvider {
    fun jobRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.create())
    }

    fun jobMultipartRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.createMultiPart())
    }

}