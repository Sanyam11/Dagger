package com.example.daggersample.di

import com.example.daggersample.MainActivity
import com.example.daggersample.processor.RepoProcessor
import dagger.Component

@Component (modules = [ExtCacheModule::class,LocalRepoModule::class,RemoteRepoModule::class])
interface RepoComponent {
    fun getRepoProcessor(): RepoProcessor
    fun inject(mainActivity: MainActivity)
}
