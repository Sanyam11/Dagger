package com.example.daggersample.repos

/*
 This is an external class, can't @Inject constructor
 */
class ExtCache(private var userId: String) {

    fun getCacheData() : String {
        return " userId : $userId Cache Data"
    }
}
