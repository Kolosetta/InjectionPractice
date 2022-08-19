package com.example.injectionpractice.example2.data.datasource

import com.example.injectionpractice.example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
    ) : ExampleRemoteDataSource {

    override fun method() {
            apiService.method()
    }
}
