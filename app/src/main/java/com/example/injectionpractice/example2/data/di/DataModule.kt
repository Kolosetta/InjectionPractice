package com.example.injectionpractice.example2.data.di

import com.example.injectionpractice.example2.data.datasource.LocalDataSource
import com.example.injectionpractice.example2.data.datasource.LocalDataSourceImpl
import com.example.injectionpractice.example2.data.datasource.RemoteDataSource
import com.example.injectionpractice.example2.data.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DataModule {

    @Binds
    abstract fun bindLocalDataSource(impl: LocalDataSourceImpl) : LocalDataSource

    @Binds
    abstract fun bindRemoteDataSource(impl: RemoteDataSourceImpl) : RemoteDataSource

}