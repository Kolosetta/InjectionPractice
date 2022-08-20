package com.example.injectionpractice.example2.data.datasource

import com.example.injectionpractice.example2.data.network.ApiService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
    ) : RemoteDataSource {

    override fun method() {
            apiService.method()
    }
}
