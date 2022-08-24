package com.example.injectionpractice.example2.data.database

import android.content.Context
import android.util.Log
import com.example.injectionpractice.R
import com.example.injectionpractice.example2.data.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleDatabase @Inject constructor(
    private val context: Context
    ) {

    fun method() {
        Log.i("TEST", "Example_db ${context.getString(R.string.app_name)}")
    }
}
