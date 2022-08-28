package com.example.injectionpractice.example2.data.di

import android.content.Context
import com.example.injectionpractice.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory


    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder{

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }

    //Альтернативный способ добавление объектов в граф зависимостей
    //Можно написать кастомный билдер, как выше, или же фабрику, как здесь
    /*@Component.Factory
    interface ApplicationComponentFactory{

        fun create(
            @BindsInstance context: Context
        ): ApplicationComponent
    }*/

}