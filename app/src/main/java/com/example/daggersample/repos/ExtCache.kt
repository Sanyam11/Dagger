package com.example.daggersample.repos

/*
 This is an external class, can't @Inject constructor
 */
class ExtCache {
    fun getCacheData(userId: String) : String {
        return " userId : $userId Cache Data"
    }
}
