package com.example.injectionpractice.example2.domain

import javax.inject.Inject

class UseCase @Inject constructor (
    private val repository: Repository
    ) {

    operator fun invoke() {
        repository.method()
    }
}
