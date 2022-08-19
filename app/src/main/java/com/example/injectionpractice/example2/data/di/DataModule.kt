package com.example.injectionpractice.example2.data.di

import com.example.injectionpractice.example2.data.datasource.ExampleLocalDataSource
import com.example.injectionpractice.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.injectionpractice.example2.data.datasource.ExampleRemoteDataSource
import com.example.injectionpractice.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl) : ExampleLocalDataSource{
        return impl
    }

    @Provides
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl) : ExampleRemoteDataSource {
        return impl
    }

}