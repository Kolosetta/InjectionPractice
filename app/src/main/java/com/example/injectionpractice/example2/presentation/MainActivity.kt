package com.example.injectionpractice.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.injectionpractice.R
import com.example.injectionpractice.example1.Activity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    //Смотреть с 10:00
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}