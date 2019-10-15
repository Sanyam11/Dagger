package com.example.daggersample.repos

import javax.inject.Inject


class LocalRepo @Inject constructor() {

    fun getLocalData() : String {
        return "local Data"
    }
}
