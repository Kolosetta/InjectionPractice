package com.example.injectionpractice.example2.presentation

import com.example.injectionpractice.example2.domain.UseCase
import javax.inject.Inject

class MyViewModel @Inject constructor(
    private val useCase: UseCase
) {
    fun method() {
        useCase.invoke()
    }
}
