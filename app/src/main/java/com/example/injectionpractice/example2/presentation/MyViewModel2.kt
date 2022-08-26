package com.example.injectionpractice.example2.presentation

import androidx.lifecycle.ViewModel
import com.example.injectionpractice.example2.domain.UseCase
import javax.inject.Inject

class MyViewModel2 @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {
    fun method() {
        useCase.invoke()
    }
}