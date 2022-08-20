package com.example.injectionpractice.example2.data.repository

import com.example.injectionpractice.example2.data.mapper.Mapper
import com.example.injectionpractice.example2.data.datasource.LocalDataSource
import com.example.injectionpractice.example2.data.datasource.RemoteDataSource
import com.example.injectionpractice.example2.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper
) : Repository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
