package com.example.daggersample.repos

import javax.inject.Inject


interface LocalRepo {
    fun getLocalData(userId : String) : String
}

class LocalRepoImpl @Inject constructor() : LocalRepo {
    override fun getLocalData(userId : String): String {
        return "local Data $userId"
    }
}
