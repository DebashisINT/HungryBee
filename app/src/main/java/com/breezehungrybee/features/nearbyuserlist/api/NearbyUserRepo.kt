package com.breezehungrybee.features.nearbyuserlist.api

import com.breezehungrybee.app.Pref
import com.breezehungrybee.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezehungrybee.features.newcollection.model.NewCollectionListResponseModel
import com.breezehungrybee.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}