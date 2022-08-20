package com.example.injectionpractice.example2.data.di

import com.example.injectionpractice.example2.data.datasource.LocalDataSource
import com.example.injectionpractice.example2.data.datasource.LocalDataSourceImpl
import com.example.injectionpractice.example2.data.datasource.RemoteDataSource
import com.example.injectionpractice.example2.data.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @Binds
    fun bindLocalDataSource(impl: LocalDataSourceImpl) : LocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: RemoteDataSourceImpl) : RemoteDataSource

}