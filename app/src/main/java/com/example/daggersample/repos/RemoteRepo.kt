package com.example.daggersample.repos

import javax.inject.Inject

class RemoteRepo @Inject constructor(){

    fun getRemoteData() : String {
        return "Remote Data"
    }
}
