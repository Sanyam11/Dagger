package com.example.daggersample.repos

import javax.inject.Inject

interface RemoteRepo {
    fun getRemoteData(userId : String) : String
}

class RemoteRepoImpl @Inject constructor(): RemoteRepo {
    override fun getRemoteData(userId: String): String {
        return "Remote Data $userId"
    }
}
