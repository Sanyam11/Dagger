package com.example.daggersample.repos

import javax.inject.Inject


interface LocalRepo {
    fun getLocalData() : String
}

class LocalRepoImpl @Inject constructor() : LocalRepo {
    override fun getLocalData(): String {
        return "local Data"
    }
}
