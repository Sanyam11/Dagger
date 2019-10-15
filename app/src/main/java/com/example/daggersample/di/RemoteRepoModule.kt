package com.example.daggersample.di

import com.example.daggersample.repos.RemoteRepo
import com.example.daggersample.repos.RemoteRepoImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RemoteRepoModule {
    @Binds abstract fun bindRemoteRepo(remoteRepoImpl: RemoteRepoImpl) : RemoteRepo
}
