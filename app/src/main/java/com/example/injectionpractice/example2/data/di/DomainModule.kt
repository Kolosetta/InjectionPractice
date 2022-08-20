package com.example.injectionpractice.example2.data.di

import com.example.injectionpractice.example2.data.repository.RepositoryImpl
import com.example.injectionpractice.example2.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DomainModule {

    @Binds
    abstract fun bindRepository(impl: RepositoryImpl): Repository


}