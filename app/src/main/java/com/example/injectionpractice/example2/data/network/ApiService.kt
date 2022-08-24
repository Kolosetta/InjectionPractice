package com.example.injectionpractice.example2.data.network

import android.content.Context
import android.util.Log
import com.example.injectionpractice.R
import com.example.injectionpractice.example2.data.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ApiService @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.i("TEST", "Example_api ${context.getString(R.string.app_name)}")
    }
}
