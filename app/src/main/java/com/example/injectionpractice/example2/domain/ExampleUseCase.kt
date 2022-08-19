package com.example.injectionpractice.example2.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor (
    private val repository: ExampleRepository) {

    operator fun invoke() {
        repository.method()
    }
}
