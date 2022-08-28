package com.example.injectionpractice.example2.data.di

import androidx.lifecycle.ViewModel
import com.example.injectionpractice.example2.presentation.MyViewModel
import com.example.injectionpractice.example2.presentation.MyViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

//Модуль возвращает реализацию ViewModel в виде мапы "Имя класса : ViewModel"
@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(MyViewModel::class)
    @Binds
    fun bindViewModel(viewModel: MyViewModel): ViewModel

    @IntoMap
    @ViewModelKey(MyViewModel2::class)
    @Binds
    fun bindViewModel2(viewModel: MyViewModel2): ViewModel
}