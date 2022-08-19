package com.example.injectionpractice.example2.data.di

import com.example.injectionpractice.example2.data.repository.ExampleRepositoryImpl
import com.example.injectionpractice.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository{
        return impl
    }


}