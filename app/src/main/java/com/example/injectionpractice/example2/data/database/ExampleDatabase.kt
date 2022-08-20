package com.example.injectionpractice.example2.data.database

import android.content.Context
import android.util.Log
import com.example.injectionpractice.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context
    ) {

    fun method() {
        Log.i("TEST", "Example_db ${context.getString(R.string.app_name)}")
    }
}
