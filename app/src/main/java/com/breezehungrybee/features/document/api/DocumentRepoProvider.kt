package com.breezehungrybee.features.document.api

import com.breezehungrybee.features.dymanicSection.api.DynamicApi
import com.breezehungrybee.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}