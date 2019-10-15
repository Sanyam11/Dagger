package com.example.daggersample.di

import com.example.daggersample.repos.ExtCache
import dagger.Module
import dagger.Provides

@Module
class ExtCacheModule {

    @Provides
    fun provideUserId() : String {
        return "UserId"
    }

    @Provides
    fun provideExtCache(userId: String): ExtCache {
        return ExtCache(userId)
    }
}
