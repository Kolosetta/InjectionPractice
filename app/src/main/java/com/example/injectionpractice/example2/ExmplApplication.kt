package com.example.injectionpractice.example2

import android.app.Application
import com.example.injectionpractice.example2.data.di.DaggerApplicationComponent

class ExmplApplication : Application() {
    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this)
    }
}