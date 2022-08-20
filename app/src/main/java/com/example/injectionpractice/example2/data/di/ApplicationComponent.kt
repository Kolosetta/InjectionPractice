package com.example.injectionpractice.example2.data.di

import com.example.injectionpractice.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

}