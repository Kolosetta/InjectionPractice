package com.example.injectionpractice.example2.presentation

import com.example.injectionpractice.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {
    fun method() {
        useCase.invoke()
    }
}
