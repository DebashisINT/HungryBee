package com.breezehungrybee.features.chat.api


object ChatRepoProvider {
    fun provideChatRepository(): ChatRepo {
        return ChatRepo(ChatApi.create())
    }
}