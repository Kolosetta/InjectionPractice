package com.example.injectionpractice.example2.data.network

import android.content.Context
import android.util.Log
import com.example.injectionpractice.R
import javax.inject.Inject

class ApiService @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.i("TEST", "Example_api ${context.getString(R.string.app_name)}")
    }
}
