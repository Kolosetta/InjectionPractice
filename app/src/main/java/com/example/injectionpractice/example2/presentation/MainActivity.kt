package com.example.injectionpractice.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.injectionpractice.R
import com.example.injectionpractice.example2.ExmplApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val myViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[MyViewModel::class.java]
    }
    private val component by lazy {
        (application as ExmplApplication).component
            .activityComponentFactory()
            .create(100)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewModel.method()
    }
}