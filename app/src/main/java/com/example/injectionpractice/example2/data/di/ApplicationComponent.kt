package com.example.injectionpractice.example2.data.di

import com.example.injectionpractice.example2.presentation.MainActivity
import dagger.Component
import javax.inject.Inject

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    @Inject
    fun inject(activity: MainActivity)

}