package com.example.daggersample.processor

import android.util.Log
import com.example.daggersample.repos.LocalRepo
import com.example.daggersample.repos.RemoteRepo
import javax.inject.Inject

class RepoProcessor @Inject constructor(
    private val localRepo: LocalRepo,
    private val remoteRepo: RemoteRepo
) {

    fun getData() {
        Log.d("RepoProcessorData",localRepo.getLocalData() + remoteRepo.getRemoteData())
    }
}
