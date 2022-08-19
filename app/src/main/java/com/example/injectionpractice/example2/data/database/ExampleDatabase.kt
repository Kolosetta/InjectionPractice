package com.example.injectionpractice.example2.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor() {

    fun method() {
        Log.i("TEST", "Example_db")
    }
}
