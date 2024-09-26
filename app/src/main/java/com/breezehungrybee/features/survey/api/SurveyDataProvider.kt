package com.breezehungrybee.features.survey.api

import com.breezehungrybee.features.photoReg.api.GetUserListPhotoRegApi
import com.breezehungrybee.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}