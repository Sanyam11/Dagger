package com.example.daggersample.di

import com.example.daggersample.repos.ExtCache
import dagger.Module
import dagger.Provides

@Module
class ExtCacheModule {
    @Provides
    fun provideExtCache(): ExtCache {
        return ExtCache()
    }
}
