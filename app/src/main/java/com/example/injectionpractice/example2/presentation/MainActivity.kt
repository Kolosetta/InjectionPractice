package com.example.injectionpractice.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.injectionpractice.R
import com.example.injectionpractice.example1.Activity

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}