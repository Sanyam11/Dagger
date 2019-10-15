package com.example.daggersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggersample.di.DaggerRepoComponent
import com.example.daggersample.processor.RepoProcessor
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repoProcessor : RepoProcessor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerRepoComponent
            .create()
            .inject(this)

        repoProcessor.getData()
    }
}
