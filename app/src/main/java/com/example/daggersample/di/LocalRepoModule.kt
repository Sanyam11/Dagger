package com.example.daggersample.di

import com.example.daggersample.repos.LocalRepo
import com.example.daggersample.repos.LocalRepoImpl
import dagger.Binds
import dagger.Module

@Module
abstract class LocalRepoModule {
    @Binds abstract fun bindLocalRepo(repoModule: LocalRepoImpl) : LocalRepo
}
