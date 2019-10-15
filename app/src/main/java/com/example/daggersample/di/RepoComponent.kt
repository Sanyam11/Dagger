package com.example.daggersample.di

import com.example.daggersample.processor.RepoProcessor
import dagger.Component

@Component
interface RepoComponent {
    fun getRepoProcessor(): RepoProcessor
}
