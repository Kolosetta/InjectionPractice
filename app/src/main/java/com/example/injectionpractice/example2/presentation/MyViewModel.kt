package com.example.injectionpractice.example2.presentation

import androidx.lifecycle.ViewModel
import com.example.injectionpractice.example2.domain.UseCase
import javax.inject.Inject

class MyViewModel @Inject constructor(
    private val useCase: UseCase,
    private val id: Int
) : ViewModel() {
    fun method() {
        useCase.invoke()
    }
}
