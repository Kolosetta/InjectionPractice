package com.example.injectionpractice.example2.data.di

import com.example.injectionpractice.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(
            @BindsInstance id: Int
        ) : ActivityComponent
    }
}