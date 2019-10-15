package com.example.daggersample.processor

import com.example.daggersample.repos.LocalRepo
import com.example.daggersample.repos.RemoteRepo

class RepoProcessor {
    private lateinit var localRepo : LocalRepo
    private lateinit var remoteRepo : RemoteRepo

    constructor(localRepo: LocalRepo,remoteRepo: RemoteRepo){
        this.localRepo = localRepo
        this.remoteRepo = remoteRepo
    }

    fun getData() : String {
        return localRepo.getLocalData() + remoteRepo.getRemoteData()
    }
}
