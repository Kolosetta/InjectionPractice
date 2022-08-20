package com.example.injectionpractice.example2.data.datasource

import com.example.injectionpractice.example2.data.database.ExampleDatabase
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor (
    private val database: ExampleDatabase
    ) : LocalDataSource {

    override fun method() {
        database.method()
    }
}
