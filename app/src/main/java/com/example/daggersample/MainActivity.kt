package com.example.daggersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggersample.di.DaggerRepoComponent
import com.example.daggersample.processor.RepoProcessor

class MainActivity : AppCompatActivity() {

    private lateinit var repoProcessor : RepoProcessor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repoProcessor = DaggerRepoComponent.create().getRepoProcessor()
        repoProcessor.getData()
    }
}
