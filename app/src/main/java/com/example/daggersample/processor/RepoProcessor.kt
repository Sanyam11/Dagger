package com.example.daggersample.processor

import com.example.daggersample.repos.ExtCache
import com.example.daggersample.repos.LocalRepo
import com.example.daggersample.repos.RemoteRepo
import javax.inject.Inject

class RepoProcessor @Inject constructor(
    private val localRepo: LocalRepo,
    private val remoteRepo: RemoteRepo,
    private val extCache: ExtCache
) {
    fun getData(): String {
        return localRepo.getLocalData() + remoteRepo.getRemoteData() + extCache.getCacheData()
    }
}
