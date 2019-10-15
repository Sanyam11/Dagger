package com.example.daggersample.di

import com.example.daggersample.MainActivity
import com.example.daggersample.processor.RepoProcessor
import dagger.Component

@Component
interface RepoComponent {
    fun getRepoProcessor(): RepoProcessor

    fun inject(mainActivity: MainActivity)
}
