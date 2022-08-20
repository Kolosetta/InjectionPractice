package com.example.injectionpractice.example2.data.network

import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor() {

    fun method() {
        Log.i("TEST", "Example_api")
    }
}
