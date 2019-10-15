package com.example.daggersample.di

import com.example.daggersample.MainActivity
import com.example.daggersample.processor.RepoProcessor
import com.example.daggersample.repos.ExtCache
import dagger.BindsInstance
import dagger.Component

@Component (modules = [LocalRepoModule::class,RemoteRepoModule::class])
interface RepoComponent {
    fun getRepoProcessor(): RepoProcessor
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun extCache(extCache: ExtCache): Builder

        fun build(): RepoComponent
    }
}
