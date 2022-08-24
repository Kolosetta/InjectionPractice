package com.example.injectionpractice.example2.data.di

import android.content.Context
import com.example.injectionpractice.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

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