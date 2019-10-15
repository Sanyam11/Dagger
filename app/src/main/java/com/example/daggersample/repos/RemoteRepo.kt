package com.example.daggersample.repos

import javax.inject.Inject

interface RemoteRepo {
    fun getRemoteData() : String
}

class RemoteRepoImpl @Inject constructor(): RemoteRepo {
    override fun getRemoteData(): String {
        return "Remote Data"
    }
}
